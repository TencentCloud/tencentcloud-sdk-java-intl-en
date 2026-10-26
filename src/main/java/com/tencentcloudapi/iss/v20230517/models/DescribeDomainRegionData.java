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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainRegionData extends AbstractModel {

    /**
    * Service node description
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Service node ID (the ClusterId required in other APIs)
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Region information
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Service node description 
     * @return Label Service node description
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Service node description
     * @param Label Service node description
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Service node ID (the ClusterId required in other APIs) 
     * @return Value Service node ID (the ClusterId required in other APIs)
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Service node ID (the ClusterId required in other APIs)
     * @param Value Service node ID (the ClusterId required in other APIs)
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Region information 
     * @return Region Region information
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region information
     * @param Region Region information
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public DescribeDomainRegionData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainRegionData(DescribeDomainRegionData source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

