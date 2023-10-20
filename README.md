# OOP-labs

## lab 2
**task 1**

Să se creeze o clasă numită Complex, care are doi membri de tip int (real și imaginary), care vor fi de tip private. Realizați următoarele subpuncte:

1) să se creeze trei constructori: primul primește doi parametri de tip int (primul desemnează partea reală a unui număr complex, al doilea partea imaginară), al doilea nu primește niciun parametru și apelează primul constructor cu valorile 0 și 0, iar al treilea reprezinta un copy constructor, care primește ca parametru un obiect de tip Complex, care este copiat în obiectul this.
2) să se scrie metode de tip getter și setter (remember primul laborator - proprietăți), prin care putem accesa membrii privați ai clasei
3) să se scrie o metodă de tip void numită addWithComplex, care primește ca parametru un obiect de tip Complex, prin care se adună numărul complex dat ca parametru la numărul care apelează funcția (adică la this)
4) să se scrie o metodă de tip void numită showNumber, prin care se afișează numărul complex astfel:
   a + i * b, daca b >0
   a - i * b, daca b<0
   a, daca b = 0
