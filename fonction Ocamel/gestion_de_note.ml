
let rec taille_liste liste =
  match liste with
  |[] -> 0
  |x :: l -> 1 + taille_liste l
               
let rec somme liste = 
  match liste with
  |[] -> 0.0
  |x :: l -> x +. somme l

let moyenne liste = 
  (somme liste) /. float_of_int (taille_liste liste)
    
    
let max_liste liste = 
  let rec max liste = 
    match liste with
    |x :: [] -> x
    |x :: y :: l -> if x > y then max (x::l) else max (y::l)
  in if liste = [] then failwith "Erreur liste vide" else max liste
                                                    
let min_liste liste =
  let rec min liste =
    match liste with
    |x :: [] -> x
    |x :: y :: l -> if x < y then min (x::l) else min (y::l)
  in if liste = [] then failwith "Erreur liste vide" else min liste
      
let produit_en_croix valeur max new_max =
  (valeur *. new_max) /. max
  
  
