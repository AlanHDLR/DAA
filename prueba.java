public class prueba {
public void seleccion(int[]arr)
{
	int pivote = 0;
	int temp = 0;
	int aux == 0;
	int min = 0;
	for(pivote = 0;pivote < arr.lenght();pivote++){
		for(aux = pivote+1;aux < aux.lenght();aux++){
			if((arr[aux] < arr[min])){
				min = aux;
			}
		}
	temp = arr[pivote];
	arr[pivote] = arr[min];
	arr[min] = temp;
	}
}
}
