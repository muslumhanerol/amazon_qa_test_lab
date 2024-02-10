const alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,?!'_-&@#$%*()/:<>|+!'^+= "

function encryptText(text, key){
    let encryptText = "";

    for(let i = 0; i < text.length; i++){
        const textChar = text[i];
        const keyChar = key[i % key.length];

        const textIndex = alphabet.indexOf(textChar);
        const keyIndex = alphabet.indexOf(keyChar);

        if(textIndex === -1){
            encryptText += textChar;
        }else{
            const newIndex = (textIndex + keyIndex) % alphabet.length;

            encryptedText += alphabet[newIndex];
        }
    }

    return encryptedText;
}

function decryptText(encryptedText, key){
    let decryptedText ="";


    for(let i=0; i < encryptedText.length; i++){
        const encryptedChar = encryptedText[i];
        const keyChar = key[i % key.length];

        const encryptedIndex = alphabet.indexOf(encryptedChar);
        const keyIndex = alphabet.indexOf(keyChar);

        if(encryptedText === -1){
            decryptedText += encryptedChar;
        }else{
            let newIndex = encryptedChar - keyIndex;

            if(newIndex < 0) newIndex += alphabet.length;
            decryptedText += alphabet[newIndex];            
        }
    }
}
