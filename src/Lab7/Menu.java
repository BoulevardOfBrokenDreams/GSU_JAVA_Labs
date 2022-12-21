package Lab7;



import Lab3.Employee;
import Lab7.FileCollection.*;
import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu {

    private JButton CreateFileButton;
    private JButton ReadFromFileButton;
    private JButton AddElementButton;
    private JButton PrintToFIleButton;
    private JButton UpdateElementButton;
    private JPanel mainWindow;
    private JLabel FirstNameLabel;
    private JLabel LastNameLabel;
    private JLabel BirthDayLabel;
    private JLabel PostLabel;
    private JLabel DateOfEmployLabel;
    private JLabel DismissDateLabel;
    private JLabel IndexNumberL;
    private JTextArea LastNameTA;
    private JTextArea BirthdayTA;
    private JTextArea PostTA;
    private JTextArea EmployDateTA;
    private JTextArea DismissDateTA;
    private JButton DeleteElementButton;
    private JButton PreviousButton;
    private JButton NextButton;
    private JTextField FileNameTF;
    private JLabel DialogLabel;
    private JButton OnAddElementButton;
    private JTextArea FirstNameTA;
    private JButton UpdateOkButton;
    private JLabel IndexLabelInt;

    FileCollection fileCollection = new FileCollection(new Collection<>(new Employee[2]), new CollectionView<>());
    public int collectionIndex = 0;

    public Menu(){
        setUnenable();
        setNull();

        this.CreateFileButton.addActionListener(e -> {
            this.DialogLabel.setText(fileCollection.createFile(this.FileNameTF.getText()));
            setEnabled();
            checker();
        });

        this.ReadFromFileButton.addActionListener(e -> {
            this.DialogLabel.setText(fileCollection.readFromFile());
            collectionIndex = 0;
            if(fileCollection.getTCollection().getCollection()[0] != null){
                printElement(fileCollection.getTCollection().getCollection()[0]);
            }
            this.IndexLabelInt.setText(Integer.toString(collectionIndex));
            checker();
        });

        this.PrintToFIleButton.addActionListener(e -> {
            try{
                this.DialogLabel.setText(fileCollection.printToFile());
            }catch (Exception exception){
                this.DialogLabel.setText(exception.getMessage());
            }
        });

        this.AddElementButton.addActionListener(e -> {
            this.OnAddElementButton.setVisible(true);
            this.OnAddElementButton.setEnabled(true);
            setEditable();
            setEmptyText();

            this.OnAddElementButton.addActionListener(e1 -> {
                try{
                    fileCollection.addElement(new Employee(this.FirstNameTA.getText(),
                                                            this.LastNameTA.getText(),
                                                            new SimpleDateFormat("dd.MM.yyyy").parse(this.BirthdayTA.getText()),
                                                            this.PostTA.getText(),
                                                            new SimpleDateFormat("dd.MM.yyyy").parse(this.EmployDateTA.getText()),
                                                            new SimpleDateFormat("dd.MM.yyyy").parse(this.DismissDateTA.getText())));
                }catch (Exception exception){
                    this.DialogLabel.setText(exception.getMessage());
                }finally {
                    this.OnAddElementButton.setVisible(false);
                    setUneditable();
                    collectionIndex = 0;
                    printElement(fileCollection.getTCollection().getCollection()[0]);
                    this.IndexLabelInt.setText(Integer.toString(collectionIndex));
                    checker();
                }
            });
        });

        this.NextButton.addActionListener(e -> {
            collectionIndex++;
            printElement(fileCollection.getTCollection().getCollection()[collectionIndex]);
            this.IndexLabelInt.setText(Integer.toString(collectionIndex));
            checker();
        });

        this.PreviousButton.addActionListener(e -> {
            collectionIndex--;
            printElement(fileCollection.getTCollection().getCollection()[collectionIndex]);
            this.IndexLabelInt.setText(Integer.toString(collectionIndex));
            checker();
        });

        this.UpdateElementButton.addActionListener(e -> {
            this.setUnenable();
            this.setEditable();
            this.UpdateOkButton.setEnabled(true);

            this.UpdateOkButton.addActionListener(e1 -> {
                try{
                    this.DialogLabel.setText(fileCollection.updateElement(new Employee(this.FirstNameTA.getText(),
                            this.LastNameTA.getText(),
                            new SimpleDateFormat("dd.MM.yyyy").parse(this.BirthdayTA.getText()),
                            this.PostTA.getText(),
                            new SimpleDateFormat("dd.MM.yyyy").parse(this.EmployDateTA.getText()),
                            new SimpleDateFormat("dd.MM.yyyy").parse(this.DismissDateTA.getText())), collectionIndex));
                }catch(Exception exception){
                    this.DialogLabel.setText(exception.getMessage());
                }finally {
                    collectionIndex = 0;
                    if(fileCollection.getTCollection().getCollection()[0] != null){
                        printElement(fileCollection.getTCollection().getCollection()[0]);
                    }
                    this.UpdateOkButton.setEnabled(false);
                    setEnabled();
                    setUneditable();
                    checker();
                }
            });

        });

        this.DeleteElementButton.addActionListener(e -> {
            fileCollection.deleteElement(collectionIndex);
        });
    }

    private void checker(){
        this.PreviousButton.setEnabled(collectionIndex != 0);
        this.NextButton.setEnabled(collectionIndex != this.fileCollection.getTCollection().getCollection().length - 1);
        this.NextButton.setEnabled(this.fileCollection.getTCollection().getCollection()[collectionIndex + 1] != null);
    }

    private void printElement(Employee item){
        SimpleDateFormat DateFor = new SimpleDateFormat("dd.MM.yyyy");
        this.FirstNameTA.setText(item.getFirstName());
        this.LastNameTA.setText(item.getLastName());
        this.BirthdayTA.setText(DateFor.format(item.getBirthday()));
        this.PostTA.setText(item.getPost());
        this.EmployDateTA.setText(DateFor.format(item.getDateOfEmploy()));
        this.DismissDateTA.setText(DateFor.format(item.getDateOfDismiss()));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Title");
        frame.setContentPane(new Menu().mainWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void setEnabled(){
        this.AddElementButton.setEnabled(true);
        this.ReadFromFileButton.setEnabled(true);
        this.PrintToFIleButton.setEnabled(true);
        this.UpdateElementButton.setEnabled(true);
        this.DeleteElementButton.setEnabled(true);
        this.NextButton.setEnabled(true);
        this.PreviousButton.setEnabled(true);
    }

    private void setUnenable(){
        this.OnAddElementButton.setEnabled(false);
        this.AddElementButton.setEnabled(false);
        this.ReadFromFileButton.setEnabled(false);
        this.PrintToFIleButton.setEnabled(false);
        this.UpdateElementButton.setEnabled(false);
        this.DeleteElementButton.setEnabled(false);
        this.NextButton.setEnabled(false);
        this.PreviousButton.setEnabled(false);
        this.UpdateOkButton.setEnabled(false);
    }

    private void setEditable(){
        this.FirstNameTA.setEditable(true);
        this.LastNameTA.setEditable(true);
        this.BirthdayTA.setEditable(true);
        this.PostTA.setEditable(true);
        this.EmployDateTA.setEditable(true);
        this.DismissDateTA.setEditable(true);
    }

    private void setUneditable(){
        this.FirstNameTA.setEditable(false);
        this.LastNameTA.setEditable(false);
        this.BirthdayTA.setEditable(false);
        this.PostTA.setEditable(false);
        this.EmployDateTA.setEditable(false);
        this.DismissDateTA.setEditable(false);
    }

    private void setEmptyText(){
        this.FirstNameTA.setText("");
        this.LastNameTA.setText("");
        this.BirthdayTA.setText("");
        this.PostTA.setText("");
        this.EmployDateTA.setText("");
        this.DismissDateTA.setText("");
    }

    private void setNull(){
        this.FirstNameTA.setText("Null");
        this.LastNameTA.setText("Null");
        this.BirthdayTA.setText("Null");
        this.PostTA.setText("Null");
        this.EmployDateTA.setText("Null");
        this.DismissDateTA.setText("Null");
    }
}
