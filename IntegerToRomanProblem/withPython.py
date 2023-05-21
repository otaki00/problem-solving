


# Wooooow, Mind bloowing
# this is very simple this its master level i hope i will reach it one day 
# but i think its not scense because in ths you need to add more like what if it was 4000 or 6000
# but still very impresive solution

def intToRoman(num):
    ones = ["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"];
    tens = ["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"];
    hrns = ["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"];
    ths = ["", "M", "MM", "MMM"];

    return ths[Math.floor(num / 1000)] + hrns[Math.floor((num % 1000) / 100)] + tens[Math.floor((num % 100) / 10)] + ones[num % 10];
