double perimetro, lado;
Scanner teclado = new Scanner(System.in);
System.out.println("Introdusca la medida de uno de sus lados");
lado = teclado.nextDouble();
perimetro = lado*6;
System.out.println("El perimetro del hexagono es " + perimetro + " centimetros");
