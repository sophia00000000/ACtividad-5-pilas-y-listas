ejer1:
  pila y pila auxiliar
  llenar pila 
  pop el primero de la pila = primero 
  llenar pila uxiliar al vaciar la pila 
  pop el primero de l apila uxiliar = ultimo 
  pila.push(primero)
  llenar la pila original con la auxiliar
  pila.push(ultimo)
  fin

  tmb se puede hacer con un arreglo 

  ejer2: 
    llenar pila con vsalores ascendentes (for)
    funcion recursiva incertardato recibe la pila y el dato 
      caso base: si la pila está vacía o si el peek es menor al dato a insertar:
        push.(dato)
        else:
        tope=pila.pop
        caso recursivo: incertardato(pila, dato) //hasta encontrar donde incertar el dato y el neuvo tope se va guardando
        pila.push(tope) 
          
  ejer3: 
    establo1 =ArrayList
    establo2 = satck
    establo3 = stack
    funcion llenar establo 1 con numeros aleatorios 
    funcion separar novillos e ir agrganodo a las pilas segun el peso y eliminar del arreglo original 
      con un while(!establo.isEmpty)
        separar
        i++ si no se elimino ningun elemento
      funcion promedios 
        sumar y promediar si las lista o pilas no están vacías

  ejer4:
    public static ArrayList<Stack<Stack<String>>> bodega = new ArrayList();
    funcion llenar bodega
    funcion recursiva sacarContenedor(codigo)
      for i<bodega.size 
        for 
        caso base: si pila.peek == codigo
            pila.pop()
        caso recursivo: 
          tope= pila.pop
          sacarContenedor(codigo) 
          pila(push.tope)


    ejer6
      arraylist de ventas 
