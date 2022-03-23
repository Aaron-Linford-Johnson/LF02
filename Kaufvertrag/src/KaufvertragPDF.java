import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;

import java.awt.*;
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
        fontueberschrift.setFontSize(30);
        fontueberschrift.setBold();
        fontueberschrift.setUnderline();
        fontueberschrift.setTextAlignment(TextAlignment.CENTER);
        //Absatzüberschrift
        Style fontAbsatzUeberschrift = new Style();
        fontAbsatzUeberschrift.setFont(PdfFontFactory.createFont(StandardFonts.HELVETICA));
        fontAbsatzUeberschrift.setFontSize(17);
        fontAbsatzUeberschrift.setUnderline();
        fontAbsatzUeberschrift.setItalic();

        //Käufer
        Vertragspartner kaeufer = new Vertragspartner("Azam", "Alalali");
        kaeufer.setAdresse(new Adresse("Tom Straße", "12","28277","Bremen"));
        kaeufer.setAusweisNr("123456");
        //Verkäufer
        Vertragspartner verkaeufer = new Vertragspartner("Aaron", "Johnson");
        verkaeufer.setAdresse(new Adresse("Timmer Straße","91","28277","Bremen"));
        verkaeufer.setAusweisNr("654321");
        //Ware
        Ware kette = new Ware("Königskette", 10000.500);
        kette.setBeschreibung("Die perfekte Kette um sich viele Prüfungen zu Angeln!");
        kette.getBesonderheiten().add("Frauenmagnet");
        kette.getMaengel().add("Das zu lange tragen dieser Kette kann dazu führen, dass jede Frau auf der Welt auf sie steht außer die Frauen der Familie Johnson");


        Paragraph ueberschrift = new Paragraph("Kaufvertrag");
        ueberschrift.addStyle(fontueberschrift);
        ueberschrift.add("\n");
        //Warentabelle
        Table waretable = new Table(2);
        Cell header1 = new Cell();
        header1.add(new Paragraph("Text"));
        header1.setTextAlignment(TextAlignment.CENTER);
        waretable.addHeaderCell()

        Paragraph ware = new Paragraph(new Text("Ware Information").addStyle(fontAbsatzUeberschrift));
        ware.add("\n");
        ware.add("" + kette);
        ware.add("\n");
        ware.add("\n");

        Paragraph pKaeufer = new Paragraph(new Text("Käufer Information").addStyle(fontAbsatzUeberschrift));
        pKaeufer.add("\n");
        pKaeufer.add("" + kaeufer);
        pKaeufer.add("\n");
        pKaeufer.add("\n");


        Paragraph pverkaeufer = new Paragraph(new Text("Verkäufer Information").addStyle(fontAbsatzUeberschrift));

        pverkaeufer.add("\n");
        pverkaeufer.add("" + verkaeufer);
        pverkaeufer.add("\n");
        pverkaeufer.add("\n");

        document.add(ueberschrift);
        document.add(ware);
        document.add(pKaeufer);
        document.add(pverkaeufer);

        document.close();
    }

}
