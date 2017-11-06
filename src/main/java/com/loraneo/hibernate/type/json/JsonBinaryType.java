package com.loraneo.hibernate.type.json;

import java.util.Properties;

import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.usertype.DynamicParameterizedType;

/**
 * Descriptor for a Json type.
 *
 * @author Vlad MIhalcea
 *
 */
public class JsonBinaryType extends AbstractSingleColumnStandardBasicType<Object> implements DynamicParameterizedType {

	public JsonBinaryType() {
		super(JsonBinarySqlTypeDescriptor.INSTANCE, new JsonTypeDescriptor());
	}

	public String getName() {
		return "jsonb";
	}

	@Override
	public void setParameterValues(Properties parameters) {
		((JsonTypeDescriptor) getJavaTypeDescriptor()).setParameterValues(parameters);
	}

}
