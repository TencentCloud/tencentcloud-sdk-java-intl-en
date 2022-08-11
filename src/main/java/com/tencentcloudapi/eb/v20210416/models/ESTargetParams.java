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

public class ESTargetParams extends AbstractModel{

    /**
    * Network connection type
    */
    @SerializedName("NetMode")
    @Expose
    private String NetMode;

    /**
    * Index prefix
    */
    @SerializedName("IndexPrefix")
    @Expose
    private String IndexPrefix;

    /**
    * ES log rotation interval
    */
    @SerializedName("RotationInterval")
    @Expose
    private String RotationInterval;

    /**
    * DTS event configuration
    */
    @SerializedName("OutputMode")
    @Expose
    private String OutputMode;

    /**
    * DTS indexing configuration
    */
    @SerializedName("IndexSuffixMode")
    @Expose
    private String IndexSuffixMode;

    /**
    * ES template type
    */
    @SerializedName("IndexTemplateType")
    @Expose
    private String IndexTemplateType;

    /**
     * Get Network connection type 
     * @return NetMode Network connection type
     */
    public String getNetMode() {
        return this.NetMode;
    }

    /**
     * Set Network connection type
     * @param NetMode Network connection type
     */
    public void setNetMode(String NetMode) {
        this.NetMode = NetMode;
    }

    /**
     * Get Index prefix 
     * @return IndexPrefix Index prefix
     */
    public String getIndexPrefix() {
        return this.IndexPrefix;
    }

    /**
     * Set Index prefix
     * @param IndexPrefix Index prefix
     */
    public void setIndexPrefix(String IndexPrefix) {
        this.IndexPrefix = IndexPrefix;
    }

    /**
     * Get ES log rotation interval 
     * @return RotationInterval ES log rotation interval
     */
    public String getRotationInterval() {
        return this.RotationInterval;
    }

    /**
     * Set ES log rotation interval
     * @param RotationInterval ES log rotation interval
     */
    public void setRotationInterval(String RotationInterval) {
        this.RotationInterval = RotationInterval;
    }

    /**
     * Get DTS event configuration 
     * @return OutputMode DTS event configuration
     */
    public String getOutputMode() {
        return this.OutputMode;
    }

    /**
     * Set DTS event configuration
     * @param OutputMode DTS event configuration
     */
    public void setOutputMode(String OutputMode) {
        this.OutputMode = OutputMode;
    }

    /**
     * Get DTS indexing configuration 
     * @return IndexSuffixMode DTS indexing configuration
     */
    public String getIndexSuffixMode() {
        return this.IndexSuffixMode;
    }

    /**
     * Set DTS indexing configuration
     * @param IndexSuffixMode DTS indexing configuration
     */
    public void setIndexSuffixMode(String IndexSuffixMode) {
        this.IndexSuffixMode = IndexSuffixMode;
    }

    /**
     * Get ES template type 
     * @return IndexTemplateType ES template type
     */
    public String getIndexTemplateType() {
        return this.IndexTemplateType;
    }

    /**
     * Set ES template type
     * @param IndexTemplateType ES template type
     */
    public void setIndexTemplateType(String IndexTemplateType) {
        this.IndexTemplateType = IndexTemplateType;
    }

    public ESTargetParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ESTargetParams(ESTargetParams source) {
        if (source.NetMode != null) {
            this.NetMode = new String(source.NetMode);
        }
        if (source.IndexPrefix != null) {
            this.IndexPrefix = new String(source.IndexPrefix);
        }
        if (source.RotationInterval != null) {
            this.RotationInterval = new String(source.RotationInterval);
        }
        if (source.OutputMode != null) {
            this.OutputMode = new String(source.OutputMode);
        }
        if (source.IndexSuffixMode != null) {
            this.IndexSuffixMode = new String(source.IndexSuffixMode);
        }
        if (source.IndexTemplateType != null) {
            this.IndexTemplateType = new String(source.IndexTemplateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetMode", this.NetMode);
        this.setParamSimple(map, prefix + "IndexPrefix", this.IndexPrefix);
        this.setParamSimple(map, prefix + "RotationInterval", this.RotationInterval);
        this.setParamSimple(map, prefix + "OutputMode", this.OutputMode);
        this.setParamSimple(map, prefix + "IndexSuffixMode", this.IndexSuffixMode);
        this.setParamSimple(map, prefix + "IndexTemplateType", this.IndexTemplateType);

    }
}

