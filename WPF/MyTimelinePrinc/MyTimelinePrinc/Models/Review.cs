using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyTimelinePrinc.Models
{
    public class Review
    {
        public string titulo { get; set; }
        public int nota { get; set; }
        public string sinopsis { get; set; }
        public string descripcion { get; set; }
        public string favorito { get; set; }
        public string estado { get; set; }

    }
    public class ReviewList
    {
        public static List<Review> GetReviews()
        {
            var reviews = new List<Review>();

            reviews.Add(new Review { titulo = "titanic", nota = 7, sinopsis = "aa", descripcion = "", favorito = "si", estado = "visto" });
            reviews.Add(new Review { titulo = "rober", nota = 7, sinopsis = "as", descripcion = "", favorito = "si", estado = "visto" });
            reviews.Add(new Review { titulo = "gg", nota = 7, sinopsis = "ad", descripcion = "", favorito = "si", estado = "visto" });
            reviews.Add(new Review { titulo = "casa", nota = 7, sinopsis = "cd", descripcion = "", favorito = "si", estado = "visto" });

            return reviews;
        }
    }
}
