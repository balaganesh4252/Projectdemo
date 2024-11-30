import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class prac {
    public static void main(String[] args) throws Exception {
        // Create a PDF writer
        PdfWriter writer = new PdfWriter("table.pdf");

        // Create a PDF document
        PdfDocument pdfDoc = new PdfDocument(writer);

        // Create a document
        Document doc = new Document(pdfDoc);

        // Create a table
        Table table = new Table(3);

        // Add header cells
        table.addHeaderCell(new Cell().add("Name").setTextAlignment(TextAlignment.CENTER));
        table.addHeaderCell(new Cell().add("Age").setTextAlignment(TextAlignment.CENTER));
        table.addHeaderCell(new Cell().add("City").setTextAlignment(TextAlignment.CENTER));

        // Add data cells
        table.addCell(new Cell().add("John Doe"));
        table.addCell(new Cell().add("30"));
        table.addCell(new Cell().add("New York"));

        table.addCell(new Cell().add("Jane Doe"));
        table.addCell(new Cell().add("25"));
        table.addCell(new Cell().add("Los Angeles"));

        // Add table to document
        doc.add(table);

        // Close the document
        doc.close();
    }
}

