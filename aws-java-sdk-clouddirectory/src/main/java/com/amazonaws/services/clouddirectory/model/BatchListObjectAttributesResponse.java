/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <code>ListObjectAttributes</code> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/BatchListObjectAttributesResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListObjectAttributesResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Attributes map associated with the object. <code>AttributeArn</code> is the key; attribute value is the value.
     * </p>
     */
    private java.util.List<AttributeKeyAndValue> attributes;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Attributes map associated with the object. <code>AttributeArn</code> is the key; attribute value is the value.
     * </p>
     * 
     * @return Attributes map associated with the object. <code>AttributeArn</code> is the key; attribute value is the
     *         value.
     */

    public java.util.List<AttributeKeyAndValue> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Attributes map associated with the object. <code>AttributeArn</code> is the key; attribute value is the value.
     * </p>
     * 
     * @param attributes
     *        Attributes map associated with the object. <code>AttributeArn</code> is the key; attribute value is the
     *        value.
     */

    public void setAttributes(java.util.Collection<AttributeKeyAndValue> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<AttributeKeyAndValue>(attributes);
    }

    /**
     * <p>
     * Attributes map associated with the object. <code>AttributeArn</code> is the key; attribute value is the value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        Attributes map associated with the object. <code>AttributeArn</code> is the key; attribute value is the
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectAttributesResponse withAttributes(AttributeKeyAndValue... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<AttributeKeyAndValue>(attributes.length));
        }
        for (AttributeKeyAndValue ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Attributes map associated with the object. <code>AttributeArn</code> is the key; attribute value is the value.
     * </p>
     * 
     * @param attributes
     *        Attributes map associated with the object. <code>AttributeArn</code> is the key; attribute value is the
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectAttributesResponse withAttributes(java.util.Collection<AttributeKeyAndValue> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListObjectAttributesResponse withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchListObjectAttributesResponse == false)
            return false;
        BatchListObjectAttributesResponse other = (BatchListObjectAttributesResponse) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchListObjectAttributesResponse clone() {
        try {
            return (BatchListObjectAttributesResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchListObjectAttributesResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
