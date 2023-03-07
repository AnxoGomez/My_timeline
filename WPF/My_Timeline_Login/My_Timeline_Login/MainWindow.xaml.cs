using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace My_Timeline_Login
{
  
    
    public partial class MainWindow : Window
    {
        //true = register  false = login
        bool mode;



        public MainWindow()
        {
            InitializeComponent();
            mode = true;
            changeMode(mode);
        }

        //clickar los botones
        void changeMode(bool n)
        {
            if (n)
            {
                var bc = new BrushConverter();
                registerColor.Background = (Brush)bc.ConvertFrom("#ff3f79");
                loginColor.Background = Brushes.Transparent;
            }
            else
            {
                var bc = new BrushConverter();
                loginColor.Background = (Brush)bc.ConvertFrom("#ff3f79");
                registerColor.Background = Brushes.Transparent;
            }
        }

        //metodo que vuelve a poner los placeholders al cambiar de inicio a registro y viceversa
        void resetText()
        {
            usernameBox.Foreground = Brushes.Gray;
            passwordBox.Foreground = Brushes.Gray;
            usernameBox.Text = "Usuario";
            passwordBox.Text = "Contraseña";
        }

        private void registerButton_Click(object sender, RoutedEventArgs e)
        {
            if (!mode)
            {
                button_Login.Content = "Registrarse";
                resetText();
                mode = true;
                changeMode(mode);

            }
           
        }

        private void loginButton_Click(object sender, RoutedEventArgs e)
        {
            if (mode)
            {
                button_Login.Content = "Iniciar Sesion";
                resetText();
                mode = false;
                changeMode(mode);
            }
            
        }

        private void usernameBox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }

        private void usernameBox_Enter(object sender, RoutedEventArgs e)
        {
            if (usernameBox.Text.Equals("Usuario"))
            {
                usernameBox.Text = "";
                usernameBox.Foreground = Brushes.Black;
            }
            
        }

        private void usernameBox_Out(object sender, RoutedEventArgs e)
        {
            if (usernameBox.Text.Equals(""))
            {
                usernameBox.Text = "Usuario";
                usernameBox.Foreground = Brushes.Gray;
            }
        }

        private void login_Enter(object sender, RoutedEventArgs e)
        {
            if (passwordBox.Text.Equals("Contraseña"))
            {
                passwordBox.Text = "";
                passwordBox.Foreground = Brushes.Black;
            }
                
            
        }

        private void login_Out(object sender, RoutedEventArgs e)
        {
            if (passwordBox.Text.Equals(""))
            {
                passwordBox.Foreground = Brushes.Gray;
                passwordBox.Text = "Contraseña";
            }
        }
    }
}
