import pandas as pand

if __name__ == '__main__':
    data = pand.read_csv("/data/personal_estrategico_vacunado_covid.csv")

    dataIndexada = data.set_index("Documento_identidad")

    dataLimpio = dataIndexada.dropna() .drop_duplicates()

    dataArriba = dataLimpio.iloc[0:30]

    dataAbajo = dataLimpio.iloc[len(dataLimpio)-21:len(dataLimpio)-1]

    dataJunta = pand.concat([dataArriba,dataAbajo])

    print(len(dataJunta))

    dataJunta.to_csv("nuevocsv.csv")







