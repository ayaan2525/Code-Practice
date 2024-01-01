def shingles(doc1, doc2, n):
    shingles1 = set()
    shingles2 = set()

    # For 2-shingles 
    # Generate shingles for document 1
    count = 0
    string = ""
    i = 0
    if n == 2:
        while i < len(doc1.split()):
            word = doc1.split()[i]
            count += 1
            string += " " + word
            if count == n:
                shingles1.add(string.strip())
                string = ""
                count = 0
                i -= 1  # Backtrack the pointer by one
            i += 1

        # Generate shingles for document 2
        count = 0
        string = ""
        i = 0
        while i < len(doc2.split()):
            word = doc2.split()[i]
            count += 1
            string += " " + word
            if count == n:
                shingles2.add(string.strip())
                string = ""
                count = 0
                i -= 1  # Backtrack the pointer by one
            i += 1
    
    # For 3-shingles 
    # Generate shingles for document 2
    if n==3:
        while i < len(doc1.split()):
            word = doc1.split()[i]
            count += 1
            string += " " + word
            if count == n:
                shingles1.add(string.strip())
                string = ""
                count = 0
                i -= 2  # Backtrack the pointer by one
            i += 1

    # Generate shingles for document 2
        count = 0
        string = ""
        i = 0
        while i < len(doc2.split()):
            word = doc2.split()[i]
            count += 1
            string += " " + word
            if count == n:
                shingles2.add(string.strip())
                string = ""
                count = 0
                i -= 2  # Backtrack the pointer by one
            i += 1

    print("Shingle for doc1: ", shingles1)
    print("Shingle for doc1: ", shingles2)
    Jaccard_coefficient = len(shingles1.intersection(shingles2))/len(shingles1.union(shingles2))
    print("Simmilarity between both pair of document s: ", Jaccard_coefficient)
