using MyTimelinePrinc.Models;
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
using System.Windows.Shapes;

namespace MyTimelinePrinc
{
    /// <summary>
    /// Lógica de interacción para ReseñaPrin.xaml
    /// </summary>
    public partial class ReseñaPrin : Window
    {
        bool vista = true;
        private List<Review> Reviews;
        int cont = 0;
        public ReseñaPrin()
        {
            InitializeComponent();
            this.Width = System.Windows.SystemParameters.PrimaryScreenWidth;
            this.Height = System.Windows.SystemParameters.PrimaryScreenHeight;
            this.WindowState = WindowState.Maximized;
        }
        private void Window_SizeChanged(object sender, SizeChangedEventArgs e)
        {

        }

        private void crearResena()
        {
            grdContenido.Children.Clear();
            Label labelImagen = new Label { Height = 50, Width = 50, Content = "Imagen" };
            Grid.SetColumn(labelImagen, 1);
            grdContenido.Children.Add(labelImagen);
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            grdContenido.Children.Clear();

            TextBlock nombreCategoria = new TextBlock { Text = "Pelicula", Margin = new Thickness(40, 40, 0, 0), FontSize = 42, FontFamily = new FontFamily("Sans"), FontWeight = FontWeights.Bold };
            TextBlock titulo = new TextBlock { Text = "Titulo", Margin = new Thickness(400, 100, 0, 0), FontSize = 42, FontFamily = new FontFamily("Sans") };
            TextBlock tituloResult = new TextBlock { Text = "tituloResult", Margin = new Thickness(400, 140, 0, 0), FontSize = 32, FontFamily = new FontFamily("Sans") };
            TextBlock nota = new TextBlock { Text = "Nota", Margin = new Thickness(400, 190, 0, 0), FontSize = 42, FontFamily = new FontFamily("Sans") };
            TextBlock notaResult = new TextBlock { Text = "notaResult", Margin = new Thickness(400, 230, 0, 0), FontSize = 32, FontFamily = new FontFamily("Sans") };
            TextBlock titulo2 = new TextBlock { Text = "Titulo2", Margin = new Thickness(800, 100, 0, 0), FontSize = 42, FontFamily = new FontFamily("Sans"), };
            TextBlock tituloResult2 = new TextBlock { Text = "tituloResult2", Margin = new Thickness(800, 140, 0, 0), FontSize = 32, FontFamily = new FontFamily("Sans") };
            TextBlock nota2 = new TextBlock { Text = "Nota2", Margin = new Thickness(800, 190, 0, 0), FontSize = 42, FontFamily = new FontFamily("Sans") };
            TextBlock notaResult2 = new TextBlock { Text = "notaResult2", Margin = new Thickness(800, 230, 0, 0), FontSize = 32, FontFamily = new FontFamily("Sans") };


            var btnGrande = new Button { Content = "Grande" };

            if (vista)
            {




                Grid.SetRow(nombreCategoria, 0);
                Grid.SetRow(titulo, 1);
                Grid.SetRow(tituloResult, 1);
                Grid.SetRow(nota, 1);
                Grid.SetRow(notaResult, 1);

                Grid.SetRow(titulo2, 1);
                Grid.SetRow(tituloResult2, 1);
                Grid.SetRow(nota2, 1);
                Grid.SetRow(notaResult2, 1);



                grdContenido.Children.Add(nombreCategoria);
                grdContenido.Children.Add(titulo);
                grdContenido.Children.Add(tituloResult);
                grdContenido.Children.Add(nota);
                grdContenido.Children.Add(notaResult);

                grdContenido.Children.Add(titulo2);
                grdContenido.Children.Add(tituloResult2);
                grdContenido.Children.Add(nota2);
                grdContenido.Children.Add(notaResult2);

                vista = false;
            }
            else
            {

                tituloResult.Margin = new Thickness(100, 0, 0, 0);


                Grid.SetRow(nombreCategoria, 0);
                Grid.SetRow(tituloResult, 1);
                Grid.SetRow(tituloResult, 1);
                Grid.SetRow(tituloResult, 1);
                Grid.SetRow(tituloResult, 1);
                Grid.SetRow(tituloResult, 1);


                grdContenido.Children.Add(nombreCategoria);
                grdContenido.Children.Add(tituloResult);

                vista = true;
            }
        }

        private void resenaButton_Click(object sender, RoutedEventArgs e)
        {
            crearResena();
        }
    }
}
