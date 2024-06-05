// Exercice n°1 - Pourboire

function calculateTip(montant, note){
    
    const tips = [
        {note:'terrible',percentage:0},
        {note:'poor',percentage:0.05},
        {note:'good',percentage:0.10},
        {note:'great',percentage:0.15},
        {note:'excellent',percentage:0.20}
    ];

    note = note.toLowerCase();

    const tip = tips.filter(p => p.note === note);

    if (tip.length > 0){
        return Math.ceil(montant * tip[0].percentage);
    }else{
        return "ERROR ! Rating not recognised";
    }
}

console.log("\n=== Pourboire ===\n");


console.log(calculateTip(20, "ExcellEnt"));
console.log(calculateTip(26.95, "goOd"));
console.log(calculateTip(20, "hi"));
