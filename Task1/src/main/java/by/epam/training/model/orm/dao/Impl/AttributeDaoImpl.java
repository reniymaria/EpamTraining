package by.epam.training.model.orm.dao.Impl;

import by.epam.training.model.entity.Attribute;
import by.epam.training.model.entity.factory.EntityFactory;
import by.epam.training.model.exception.product.DbException;
import by.epam.training.model.orm.dao.AttributeDao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttributeDaoImpl implements AttributeDao {
    private static final String FILENAME = "C:\\Users\\Mikle\\IdeaProjects\\EpamTraining\\Task1\\src\\main\\resources\\appliances_db.txt";

    private Scanner initScanner() throws FileNotFoundException {
        return new Scanner(new FileReader(FILENAME));
    }

    @Override
    public List<Attribute> getAllAttributes() throws DbException {
        Scanner scanner = null;
        List<Attribute> attributes = new ArrayList<>();
        try {
            scanner = initScanner();
            String line;
            while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
                String[] name_and_attrs = line.split(":");
                name_and_attrs[1] = name_and_attrs[1].replaceAll(";", "");
                name_and_attrs[1] = name_and_attrs[1].trim();
                String[] attrs_and_values = name_and_attrs[1].split(", ");
                for (String attrs_and_value : attrs_and_values) {
                    String[] attr_and_value = attrs_and_value.split("=");
                    Attribute attribute = EntityFactory.getAttribute(attr_and_value[0], attr_and_value[1]);
                    if (!attributes.contains(attribute))
                        attributes.add(attribute);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new DbException(e.getMessage());
        }finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return attributes;
    }

    @Override
    public List<String> getAllAttributeNames() throws DbException {
        List<Attribute> attributes = getAllAttributes();
        List<String> attrNames = new ArrayList<>();
        for (Attribute attribute : attributes) {
            attrNames.add(attribute.getName());
        }
        return attrNames;
    }
}
