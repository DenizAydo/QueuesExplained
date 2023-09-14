# Queues-Explained
In diesem Repository werde ich aufklären, was man unter linearen und zirkulären Queues versteht. Direkt unter diesem Reiter ist eine grobe theoretische Zusammenfassung der beiden Themen, um sich einen Gesamtüberblick verschaffen zu können. Zusätzlich wurden die linearen und kreisförmigen Queues in den Programmiersprachen Java und Python dargestellt, um eine mögliche Implementation zu visualisieren. 

## Lineare Queues
### Was sind Lineare Queues?

Eine lineare Queue (= Warteschlange) ist eine lineare Datenstruktur, die die zuerst eingetroffene Anfrage auch zuerst bearbeitet. Für dieses Prinzip wurde ein spezifischer Begriff geprägt, um die Bearbeitung in Queues besser zu beschreiben – das sogenannte “FIFO” (First in, First out) -Prinzip. Obendrauf kommt noch die Linearität, was einfach bedeutet, dass die Datenelemente in der Queue in linearer Weise verbunden sind. Diese Queue besteht wie viele andere aus zwei Zeigern – einer, der die Vorderseite (engl. Front), und einer, der die Rückseite (engl. Rear) angibt. Das Löschen erfolgt hierbei von der Vorderseite, das Löschen von der Rückseite.

### Gängige Operationen einer Linearen Queue: 
- **Front:** Die Vorderseite/ der Anfang einer Queue
- **Rear:** Die Rückseite/ das Ende einer Queue
- **EnQueue(item):** Fügt ein Element am Ende einer Queue ein
- **DeQueue():** Löscht ein Element vom Anfang der Queue

### Grafische Darstellung einer Linearen Queue: 
![Bild](https://media.geeksforgeeks.org/wp-content/uploads/20220816162225/Queue.png)

### Zeitkomplexität einer Linearen Queue:

- EnQueue(item): O(1)
- DeQueue(): O(1)
- Peek(): O(1)

### Speicherplatzkomplexität einer Linearen Queue:

- EnQueue(item): O(n)
- DeQueue(): O(n)
- Peek(): O(n)



## Zirkuläre Queues
### Was sind zirkuläre Queues?

Eine zirkuläre Queue ist ebenfalls eine lineare Datenstruktur und folgt dem "FIFO" Prinzip, genau wie die lineare Queue. Die zirkuläre Queue ist lediglich eine Art Anpassung der linearen Queue, bei der das Vordere und das hintere Ende miteinander verbunden sind, um die Platzverschwendung der linearen Queue zu optimieren und sie effizienter zu gestalten.

### Gängige Operationen in einer zirkulären Queue:
![Bild](https://media.geeksforgeeks.org/wp-content/uploads/20220608151111/UntitledDiagramdrawio-300x248.png)

(Analog zur Linearen Queue)

### Grafische Darstellung einer zirkulären Queue:
![Bild2](https://www.shiksha.com/online-courses/articles/wp-content/uploads/sites/11/2022/11/image-30.png)
