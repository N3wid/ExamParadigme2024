// Exercice n°2 - Meeting

function nbRepas(list1) {
    return list1.reduce((acc, dev) => {
        acc[dev.Repas] = (acc[dev.Repas] || 0) + 1;
        return acc;
    }, {});
}

const list1 = [
    {FirstName: 'Noah', lastName: 'M.', pays: 'Suisse', continent: 'Europe', age: 19, langue: 'C',Repas: 'vegetarien'},
    {FirstName: 'Anna', lastName: 'R.', pays: 'Liechtenstein', continent: 'Europe', age: 52, langue:'JavaScript',Repas: 'standard'},
    {FirstName: 'Ramona', lastName: 'R.', pays: 'Paraguay', continent: 'Amériques', age: 29, langue: 'Ruby',Repas: 'vegan'},
    {FirstName: 'George', lastName: 'B.', pays: 'Angleterre', continent: 'Europe', age: 81, langue: 'C',Repas: 'vegetarien'}
];

console.log(nbRepas(list1));