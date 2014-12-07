import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

public class ExtraInfo {
	private static PrintWriter ecrire;
	private static PrintWriter ecrire2;

	public static void main(String[] args) throws IOException {
		char c;
		String urlstart;
		ecrire = new PrintWriter("subst");

		try {
			urlstart = JOptionPane.showInputDialog(null, "URL", "Entree",JOptionPane.QUESTION_MESSAGE);
			URL url = new URL(urlstart);

			URLConnection conn = url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			in.readLine();
			in.close();
		}

		// /////Erreur probleme connexion////////
		catch (UnknownHostException e) {
			System.err.println(e);
			JOptionPane.showMessageDialog(null,
<<<<<<< HEAD
					"Probl�me de connexion � Internet!", "Message",
=======
					"Problème de connexion à Internet!", "Message",
>>>>>>> bf405a7602303ffd4882a4ec96af537b78098f08
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

		// /////Erreur URL Vide////////////
		catch (MalformedURLException e) {
			System.err.println(e);
			JOptionPane.showMessageDialog(null, "Vous n'avez pas saisie l'URL",
					"Message", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

		for (c = 'A'; c <= 'Z'; c++) {

			// URL url = new URL("http://www.vidal.fr/Sommaires/Substances-C.htm");
			// Ou bien...
			urlstart = "http://www.vidal.fr/Sommaires/Substances-" + c + ".htm";

			// Ou bien PrintWriter ecrire =new PrintWriter (new FileWriter("subst.dic")) ;
<<<<<<< HEAD
			//FileWriter n'accepte pas un 2�me argument pour sp�cifier l'encodage
=======
			//FileWriter n'accepte pas un 2ème argument pour spécifier l'encodage
>>>>>>> bf405a7602303ffd4882a4ec96af537b78098f08
			
			// instancier un objet de la classe URL
			URL url = new URL(urlstart);
            
			// imprimer cet objet
<<<<<<< HEAD
			System.out.println("URL � aspirer ==>" + url);
=======
			System.out.println("URL à aspirer ==>" + url);
>>>>>>> bf405a7602303ffd4882a4ec96af537b78098f08

			
			BufferedReader lire = new BufferedReader(new InputStreamReader(url.openStream()));

			do
			// faire ce qui suit
			{
				String line = lire.readLine();

				System.out.println(line);
				if (line == null) {
					break;
				}

				ecrire.write(line);
				
<<<<<<< HEAD
				// g�n�rer dans sauts de ligne
=======
				// générer dans sauts de ligne
>>>>>>> bf405a7602303ffd4882a4ec96af537b78098f08
				ecrire.write(System.getProperty("line.separator"));

			// tant que c'est vrai (true)	
			} while (true);
			
<<<<<<< HEAD
            // fermer le flux d'�criture
=======
            // fermer le flux d'écriture
>>>>>>> bf405a7602303ffd4882a4ec96af537b78098f08
			ecrire.close();
			
			//concatenation 
			ecrire = new PrintWriter(new FileOutputStream("subst", true));
		}
		

		 //////////////////////////////////////////////////////////////////////
<<<<<<< HEAD
		/////////////// Les M�dicaments par Nom Commercial///////////////////
=======
		/////////////// Les Médicaments par Nom Commercial///////////////////
>>>>>>> bf405a7602303ffd4882a4ec96af537b78098f08
		//////////////////////////////////////////////////////////////////////

		ecrire2 = new PrintWriter("medic");
		
		for (c = 'A'; c <= 'Z'; c++) {

			// URL url = new URL("http://www.vidal.fr/Sommaires/Medicaments-A.htm");
			// Ou bien...
			urlstart = "http://www.vidal.fr/Sommaires/Medicaments-" + c+ ".htm";

<<<<<<< HEAD
			// sp�cifier l'URL (plus tard), elle sera ins�r�e dans une bo�te de saisie de type InputDialog

			// Ou bien PrintWriter ecrire =new PrintWriter (new FileWriter("subst.dic")) ;
			//FileWriter n'accepte pas un 2�me argument pour sp�cifier l'encodage
=======
			// spécifier l'URL (plus tard), elle sera insérée dans une boîte de saisie de type InputDialog

			// Ou bien PrintWriter ecrire =new PrintWriter (new FileWriter("subst.dic")) ;
			//FileWriter n'accepte pas un 2ème argument pour spécifier l'encodage
>>>>>>> bf405a7602303ffd4882a4ec96af537b78098f08
			
			// instancier un objet de la classe URL
			URL url = new URL(urlstart);

			// imprimer cet objet
<<<<<<< HEAD
			System.out.println("URL � aspirer ==>" + url);
=======
			System.out.println("URL à aspirer ==>" + url);
>>>>>>> bf405a7602303ffd4882a4ec96af537b78098f08
			

			BufferedReader lire = new BufferedReader(new InputStreamReader(url.openStream()));

			do
			// faire ce qui suit
			{
				String line = lire.readLine();

				System.out.println(line);
				if (line == null) {
					break;
				}

				ecrire2.write(line);
				
<<<<<<< HEAD
				// g�n�rer dans sauts de ligne
=======
				// générer dans sauts de ligne
>>>>>>> bf405a7602303ffd4882a4ec96af537b78098f08
				ecrire2.write(System.getProperty("line.separator"));
				
             // tant que c'est vrai (true)
			} while (true);
			
<<<<<<< HEAD
			// fermer le flux d'�criture
=======
			// fermer le flux d'écriture
>>>>>>> bf405a7602303ffd4882a4ec96af537b78098f08
			ecrire2.close();
			
			//concatenation 
			ecrire2 = new PrintWriter(new FileOutputStream("medic", true));
		}
		
	}
}
