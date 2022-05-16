import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.TextAlignment;

import java.io.FileNotFoundException;
import java.io.IOException;

public class KaufvertragPDF {
    public static void main(String[] args) throws IOException {
        druckePDF();
    }



    public static void druckePDF() throws IOException {

        String datei = "H:/LF02 Blätter/KaufvertragPDF.pdf";
        PdfWriter writer = new PdfWriter(datei);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);
        //Standart Formatierung
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        document.setFont(font);
        document.setFontSize(12);
        //Überschrift
        Style fontueberschrift = new Style();
        fontueberschrift.setFont(PdfFontFactory.createFont(StandardFonts.HELVETICA));
        fontueberschrift.setFontSize(23);
        fontueberschrift.setBold();
        fontueberschrift.setTextAlignment(TextAlignment.LEFT);
        //Absatzüberschrift
        Style fontAbsatzUeberschrift = new Style();
        fontAbsatzUeberschrift.setFont(PdfFontFactory.createFont(StandardFonts.HELVETICA));
        fontAbsatzUeberschrift.setFontSize(17);
        //pImage Kleingedruckt
        Style fontSmallPrint = new Style();
        fontSmallPrint.setFontSize(10);
        fontSmallPrint.setTextAlignment(TextAlignment.LEFT);
        //Keine Garantie

        //----------------------------------------------------------------------------------------------
        //Käufer
        Vertragspartner kaeufer = new Vertragspartner("Azam", "Alalali");
        kaeufer.setAdresse(new Adresse("Tom Straße", "12","28277","Bremen"));
        kaeufer.setAusweisNr("123456");

        //Ware
        Ware kette = new Ware("Königskette", 10000);
        kette.setBeschreibung("Die perfekte Kette um sich viele Prüfungen zu Angeln! Hochwertige Diamanten wurden in die 18 Karat Goldkette eingepflanzt. Sie passt zu jedem Outfit und sorgt für absulute coolnis. Die beste Kette!!!");
        kette.getBesonderheiten().add("Frauenmagnet");
        //------------------------------------------------------------------------------------------------
        //Überschrift Document
        Paragraph ueberschrift = new Paragraph("Kaufvertrag vom XX.XX.XXXX");
        ueberschrift.addStyle(fontueberschrift);
        ueberschrift.add("\n");
        ueberschrift.add("\n");

        //Warenabsatz Überschrift
        Paragraph ware = new Paragraph(new Text("Verkaufte Ware").addStyle(fontAbsatzUeberschrift));
        ware.add("\n");

        //Bild von Kette
        String ketteK = "H:/LF02 Blätter/KingK.jpg";
        Image image1 = new Image(ImageDataFactory.create(ketteK));
        Paragraph pImage = new Paragraph();
        pImage.add(image1);
        pImage.add(new Text("\nBild der Kette").addStyle(fontSmallPrint));
        pImage.add("\n");

        //Warentabelle
        Table waretable = new Table(2);
        Cell header1 = new Cell();
        header1.add(new Paragraph());
        header1.setTextAlignment(TextAlignment.CENTER);
        waretable.addHeaderCell(header1);
        Cell header2 = new Cell();
        header2.add(new Paragraph());
        header2.setTextAlignment(TextAlignment.CENTER);
        waretable.addHeaderCell(header2);
        waretable.addCell("Bezeichnung");
        waretable.addCell(kette.getBezeichnung());
        waretable.addCell("Beschreibung");
        waretable.addCell(kette.getBeschreibung());
        waretable.addCell("Preis");
        waretable.addCell("" + kette.getPreis() + "€");
        waretable.addCell("Besonderheiten");
        waretable.addCell("" + kette.getBesonderheiten());
        waretable.addCell("Mängel");
        waretable.addCell("" + kette.getMaengel());

        //Käufer Information
        Paragraph pKaeufer = new Paragraph(new Text("Käufer Information").addStyle(fontAbsatzUeberschrift));
        pKaeufer.add("\n");
        pKaeufer.add("" + kaeufer);
        pKaeufer.add("\n");
        pKaeufer.add("\n");

        document.add(ueberschrift);
        document.add(pKaeufer);
        document.add(ware);
        document.add(pImage);
        document.add(waretable);



        document.close();
    }

}
