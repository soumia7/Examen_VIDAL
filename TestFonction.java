import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TestFonction {

	public static void main(String[] args) {

//=========================Bo�te de saisie du nom de fichier contenant le r�sultat asprie======//		
		JOptionPane jop = new JOptionPane();
		JOptionPane.showInputDialog(null, "File name ", "Entree",
				JOptionPane.QUESTION_MESSAGE);
		
//==================enregistr�  dans  un  emplacement selon le choix de l�utilisateur via  une bo�te de dialogue==========//
			JFileChooser filechoose = new JFileChooser();
		// Cr�er un JFileChooser
		   filechoose.setCurrentDirectory(new File(".")); 
		   // Le r�pertoire source du JFileChooser est le r�pertoire d�o� est lanc� notre programme
		   String approve = new String("Choisir l'emplacement d'enregistement du ficher aspire");
		// Le bouton pour valider l�enregistrement portera la mention ENREGSITRER
		   int resultatEnregistrer = filechoose.showDialog(filechoose,approve);
		   // Pour afficher le JFileChooser�
		   if (resultatEnregistrer == JFileChooser.APPROVE_OPTION)
			  // Si l�utilisateur clique sur le bouton ENREGSITRER
		   { String monFichier= new String(filechoose.getSelectedFile().toString());
		// R�cup�rer le nom du fichier qu�il a sp�cifi�
		System.out.print("\n"+monFichier);
		      } 
		   }
//============================Barres de progression=================================//
	
	
	}
	
