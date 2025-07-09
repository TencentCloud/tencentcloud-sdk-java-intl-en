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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Annotation extends AbstractModel {

    /**
    * Current actual configuration of the resource. It can contain 0 to 256 characters, which is the non-compliant configuration of the resource.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Configuration")
    @Expose
    private String Configuration;

    /**
    * Desired configuration of the resource. It can contain 0 to 256 characters, which is the compliant configuration of the resource.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DesiredValue")
    @Expose
    private String DesiredValue;

    /**
    * Comparison operator between current and desired configuration of the resource. Length is 0-16 characters. This field may be empty when custom rule reporting evaluation result.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * JSON path of current configuration in resource attribute structure. Length is 0-256 characters. This field may be empty when custom rule reporting evaluation result.
    */
    @SerializedName("Property")
    @Expose
    private String Property;

    /**
     * Get Current actual configuration of the resource. It can contain 0 to 256 characters, which is the non-compliant configuration of the resource.
Note: This field may return null, indicating that no valid value is found. 
     * @return Configuration Current actual configuration of the resource. It can contain 0 to 256 characters, which is the non-compliant configuration of the resource.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getConfiguration() {
        return this.Configuration;
    }

    /**
     * Set Current actual configuration of the resource. It can contain 0 to 256 characters, which is the non-compliant configuration of the resource.
Note: This field may return null, indicating that no valid value is found.
     * @param Configuration Current actual configuration of the resource. It can contain 0 to 256 characters, which is the non-compliant configuration of the resource.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setConfiguration(String Configuration) {
        this.Configuration = Configuration;
    }

    /**
     * Get Desired configuration of the resource. It can contain 0 to 256 characters, which is the compliant configuration of the resource.
Note: This field may return null, indicating that no valid value is found. 
     * @return DesiredValue Desired configuration of the resource. It can contain 0 to 256 characters, which is the compliant configuration of the resource.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getDesiredValue() {
        return this.DesiredValue;
    }

    /**
     * Set Desired configuration of the resource. It can contain 0 to 256 characters, which is the compliant configuration of the resource.
Note: This field may return null, indicating that no valid value is found.
     * @param DesiredValue Desired configuration of the resource. It can contain 0 to 256 characters, which is the compliant configuration of the resource.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setDesiredValue(String DesiredValue) {
        this.DesiredValue = DesiredValue;
    }

    /**
     * Get Comparison operator between current and desired configuration of the resource. Length is 0-16 characters. This field may be empty when custom rule reporting evaluation result. 
     * @return Operator Comparison operator between current and desired configuration of the resource. Length is 0-16 characters. This field may be empty when custom rule reporting evaluation result.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Comparison operator between current and desired configuration of the resource. Length is 0-16 characters. This field may be empty when custom rule reporting evaluation result.
     * @param Operator Comparison operator between current and desired configuration of the resource. Length is 0-16 characters. This field may be empty when custom rule reporting evaluation result.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get JSON path of current configuration in resource attribute structure. Length is 0-256 characters. This field may be empty when custom rule reporting evaluation result. 
     * @return Property JSON path of current configuration in resource attribute structure. Length is 0-256 characters. This field may be empty when custom rule reporting evaluation result.
     */
    public String getProperty() {
        return this.Property;
    }

    /**
     * Set JSON path of current configuration in resource attribute structure. Length is 0-256 characters. This field may be empty when custom rule reporting evaluation result.
     * @param Property JSON path of current configuration in resource attribute structure. Length is 0-256 characters. This field may be empty when custom rule reporting evaluation result.
     */
    public void setProperty(String Property) {
        this.Property = Property;
    }

    public Annotation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Annotation(Annotation source) {
        if (source.Configuration != null) {
            this.Configuration = new String(source.Configuration);
        }
        if (source.DesiredValue != null) {
            this.DesiredValue = new String(source.DesiredValue);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Property != null) {
            this.Property = new String(source.Property);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Configuration", this.Configuration);
        this.setParamSimple(map, prefix + "DesiredValue", this.DesiredValue);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Property", this.Property);

    }
}

