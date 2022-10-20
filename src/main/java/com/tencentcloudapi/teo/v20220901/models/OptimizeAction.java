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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OptimizeAction extends AbstractModel{

    /**
    * The optimization metric. Values:
<li>`Http2`</li>
<li>`Http3`</li>
<li>`Brotli`</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The network environment.
    */
    @SerializedName("Connectivity")
    @Expose
    private String Connectivity;

    /**
    * The estimated load time, in milliseconds.
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * The estimated improvement ratio, in %.
    */
    @SerializedName("Ratio")
    @Expose
    private Long Ratio;

    /**
     * Get The optimization metric. Values:
<li>`Http2`</li>
<li>`Http3`</li>
<li>`Brotli`</li> 
     * @return Name The optimization metric. Values:
<li>`Http2`</li>
<li>`Http3`</li>
<li>`Brotli`</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The optimization metric. Values:
<li>`Http2`</li>
<li>`Http3`</li>
<li>`Brotli`</li>
     * @param Name The optimization metric. Values:
<li>`Http2`</li>
<li>`Http3`</li>
<li>`Brotli`</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The network environment. 
     * @return Connectivity The network environment.
     */
    public String getConnectivity() {
        return this.Connectivity;
    }

    /**
     * Set The network environment.
     * @param Connectivity The network environment.
     */
    public void setConnectivity(String Connectivity) {
        this.Connectivity = Connectivity;
    }

    /**
     * Get The estimated load time, in milliseconds. 
     * @return Value The estimated load time, in milliseconds.
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set The estimated load time, in milliseconds.
     * @param Value The estimated load time, in milliseconds.
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get The estimated improvement ratio, in %. 
     * @return Ratio The estimated improvement ratio, in %.
     */
    public Long getRatio() {
        return this.Ratio;
    }

    /**
     * Set The estimated improvement ratio, in %.
     * @param Ratio The estimated improvement ratio, in %.
     */
    public void setRatio(Long Ratio) {
        this.Ratio = Ratio;
    }

    public OptimizeAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OptimizeAction(OptimizeAction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Connectivity != null) {
            this.Connectivity = new String(source.Connectivity);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Ratio != null) {
            this.Ratio = new Long(source.Ratio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Connectivity", this.Connectivity);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);

    }
}

