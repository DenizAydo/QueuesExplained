# Queues-Explained
In diesem Repository werde ich aufklären, was man unter linearen und zirkulären Queues versteht. Direkt unter diesem Reiter ist eine grobe theoretische Zusammenfassung der beiden Themen, um sich einen Gesamtüberblick verschaffen zu können. Zusätzlich wurden die linearen und kreisförmigen Queues in den Programmiersprachen Java und Python dargestellt, um eine mögliche Implementation zu visualisieren. 

## Lineare Queues
### Was sind Lineare Queues?

Eine lineare Queue (= Warteschlange) ist eine lineare Datenstruktur, die die zuerst eingetroffene Anfrage auch zuerst bearbeitet. Für dieses Prinzip wurde ein spezifischer Begriff geprägt, um die Bearbeitung in Queues besser zu beschreiben – das sogenannte “FIFO” (First in, First out) -Prinzip. Obendrauf kommt noch die Linearität, was einfach bedeutet, dass die Datenelemente in der Queue in linearer Weise verbunden sind. Diese Queue besteht wie viele andere aus zwei Zeigern – einer, der die Vorderseite (engl. Front), und einer, der die Rückseite (engl. Rear) angibt. Das Löschen erfolgt hierbei von der Vorderseite, das Löschen von der Rückseite.

### Gängige Operationen einer linearen Queue: 
- **Front:** Die Vorderseite/ der Anfang einer Queue
- **Rear:** Die Rückseite/ das Ende einer Queue
- **EnQueue(item):** Fügt ein Element am Ende einer Queue ein
- **DeQueue():** Löscht ein Element vom Anfang der Queue

### Grafische Darstellung einer Linearen Queue: 
![Bild](https://static.javatpoint.com/ds/images/ds-linear-vs-circular-queue.png)
