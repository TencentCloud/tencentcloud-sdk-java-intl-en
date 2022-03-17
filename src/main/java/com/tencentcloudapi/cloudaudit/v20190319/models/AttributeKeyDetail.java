/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttributeKeyDetail extends AbstractModel{

    /**
    * Input box type
    */
    @SerializedName("LabelType")
    @Expose
    private String LabelType;

    /**
    * Initial display
    */
    @SerializedName("Starter")
    @Expose
    private String Starter;

    /**
    * Display sort order
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * `AttributeKey` value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Tag
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get Input box type 
     * @return LabelType Input box type
     */
    public String getLabelType() {
        return this.LabelType;
    }

    /**
     * Set Input box type
     * @param LabelType Input box type
     */
    public void setLabelType(String LabelType) {
        this.LabelType = LabelType;
    }

    /**
     * Get Initial display 
     * @return Starter Initial display
     */
    public String getStarter() {
        return this.Starter;
    }

    /**
     * Set Initial display
     * @param Starter Initial display
     */
    public void setStarter(String Starter) {
        this.Starter = Starter;
    }

    /**
     * Get Display sort order 
     * @return Order Display sort order
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set Display sort order
     * @param Order Display sort order
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get `AttributeKey` value 
     * @return Value `AttributeKey` value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set `AttributeKey` value
     * @param Value `AttributeKey` value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Tag 
     * @return Label Tag
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag
     * @param Label Tag
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public AttributeKeyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttributeKeyDetail(AttributeKeyDetail source) {
        if (source.LabelType != null) {
            this.LabelType = new String(source.LabelType);
        }
        if (source.Starter != null) {
            this.Starter = new String(source.Starter);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelType", this.LabelType);
        this.setParamSimple(map, prefix + "Starter", this.Starter);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

