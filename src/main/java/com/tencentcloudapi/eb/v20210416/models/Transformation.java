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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Transformation extends AbstractModel{

    /**
    * Describes how to extract data
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Extraction")
    @Expose
    private Extraction Extraction;

    /**
    * Describes how to filter data
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EtlFilter")
    @Expose
    private EtlFilter EtlFilter;

    /**
    * Describes how to transform data
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Transform")
    @Expose
    private Transform Transform;

    /**
     * Get Describes how to extract data
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Extraction Describes how to extract data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Extraction getExtraction() {
        return this.Extraction;
    }

    /**
     * Set Describes how to extract data
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Extraction Describes how to extract data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraction(Extraction Extraction) {
        this.Extraction = Extraction;
    }

    /**
     * Get Describes how to filter data
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EtlFilter Describes how to filter data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public EtlFilter getEtlFilter() {
        return this.EtlFilter;
    }

    /**
     * Set Describes how to filter data
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EtlFilter Describes how to filter data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEtlFilter(EtlFilter EtlFilter) {
        this.EtlFilter = EtlFilter;
    }

    /**
     * Get Describes how to transform data
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Transform Describes how to transform data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Transform getTransform() {
        return this.Transform;
    }

    /**
     * Set Describes how to transform data
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Transform Describes how to transform data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTransform(Transform Transform) {
        this.Transform = Transform;
    }

    public Transformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Transformation(Transformation source) {
        if (source.Extraction != null) {
            this.Extraction = new Extraction(source.Extraction);
        }
        if (source.EtlFilter != null) {
            this.EtlFilter = new EtlFilter(source.EtlFilter);
        }
        if (source.Transform != null) {
            this.Transform = new Transform(source.Transform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Extraction.", this.Extraction);
        this.setParamObj(map, prefix + "EtlFilter.", this.EtlFilter);
        this.setParamObj(map, prefix + "Transform.", this.Transform);

    }
}

