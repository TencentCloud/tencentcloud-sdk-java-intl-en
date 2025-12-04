/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProcessImageTemplatesRequest extends AbstractModel {

    /**
    * Filtering condition for the unique identifier of the image processing template. The array length cannot exceed 100.
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * Pagination offset. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. The default value is 10, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filtering condition for the identifier of the image processing template.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Sorting method. It is valid after OrderBy is set. Valid values: 0: ascending; 1: descending. The default value is 0.
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * Sorting field. Valid values:
Definition: unique identifier of the template.
Default value: creation time.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Filtering condition for the template type. Valid values: <li>Preset: system preset template;</li> <li>Custom: user-defined template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Filtering condition for the unique identifier of the image processing template. The array length cannot exceed 100. 
     * @return Definitions Filtering condition for the unique identifier of the image processing template. The array length cannot exceed 100.
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set Filtering condition for the unique identifier of the image processing template. The array length cannot exceed 100.
     * @param Definitions Filtering condition for the unique identifier of the image processing template. The array length cannot exceed 100.
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get Pagination offset. The default value is 0. 
     * @return Offset Pagination offset. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. The default value is 0.
     * @param Offset Pagination offset. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. The default value is 10, and the maximum value is 100. 
     * @return Limit Number of returned entries. The default value is 10, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. The default value is 10, and the maximum value is 100.
     * @param Limit Number of returned entries. The default value is 10, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filtering condition for the identifier of the image processing template. 
     * @return Name Filtering condition for the identifier of the image processing template.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filtering condition for the identifier of the image processing template.
     * @param Name Filtering condition for the identifier of the image processing template.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Sorting method. It is valid after OrderBy is set. Valid values: 0: ascending; 1: descending. The default value is 0. 
     * @return OrderType Sorting method. It is valid after OrderBy is set. Valid values: 0: ascending; 1: descending. The default value is 0.
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sorting method. It is valid after OrderBy is set. Valid values: 0: ascending; 1: descending. The default value is 0.
     * @param OrderType Sorting method. It is valid after OrderBy is set. Valid values: 0: ascending; 1: descending. The default value is 0.
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Sorting field. Valid values:
Definition: unique identifier of the template.
Default value: creation time. 
     * @return OrderBy Sorting field. Valid values:
Definition: unique identifier of the template.
Default value: creation time.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Valid values:
Definition: unique identifier of the template.
Default value: creation time.
     * @param OrderBy Sorting field. Valid values:
Definition: unique identifier of the template.
Default value: creation time.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Filtering condition for the template type. Valid values: <li>Preset: system preset template;</li> <li>Custom: user-defined template.</li> 
     * @return Type Filtering condition for the template type. Valid values: <li>Preset: system preset template;</li> <li>Custom: user-defined template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Filtering condition for the template type. Valid values: <li>Preset: system preset template;</li> <li>Custom: user-defined template.</li>
     * @param Type Filtering condition for the template type. Valid values: <li>Preset: system preset template;</li> <li>Custom: user-defined template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeProcessImageTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProcessImageTemplatesRequest(DescribeProcessImageTemplatesRequest source) {
        if (source.Definitions != null) {
            this.Definitions = new Long[source.Definitions.length];
            for (int i = 0; i < source.Definitions.length; i++) {
                this.Definitions[i] = new Long(source.Definitions[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

