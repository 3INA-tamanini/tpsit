#include <stdio.h>
int main()
{
	int i, velocita, distanza, tempo;
	velocita = 120;

	do
	{
		printf("Inserire la distanza di una citta' da Roma (in km): ");
		scanf("%d", &distanza);

		if (distanza == 0)
			i++;
		else
			tempo = distanza / velocita;
	} while (i < 0);

	printf("Il tempo impiegato da un mezzo che si muove alla velocita'� media di 120km/h per raggiungere Roma e' di %d ore", tempo);

	return 0;
}
