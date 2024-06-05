// Exercice n°5 - Carré des nombres

function carreNombres(number) {
    return Number(
        number.toString()
            .split('')
            .map(digit => Math.pow(Number(digit), 2))
            .join('')
    );
}

// Exemples d'utilisation :
console.log(carreNombres(9119));
console.log(carreNombres(97220));
