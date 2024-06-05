// Exercice n°3 - Le mot le plus long

const longestWord = chaineCaracteres =>
    chaineCaracteres.split(" ").reduce((longest, current) => 
        current.length >= longest.length ? current : longest, "");

// Initialisation des exemples
console.log(longestWord('a b c d e fgh'));
console.log(longestWord('one two three'));
console.log(longestWord('red blue grey'));
