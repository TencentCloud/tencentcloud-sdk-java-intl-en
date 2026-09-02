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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSandboxDLPUserRuleInfo extends AbstractModel {

    /**
    * File name match dimension: summarized and deduplicated file name/regular list
    */
    @SerializedName("FileName")
    @Expose
    private String [] FileName;

    /**
    * File size limit dimension (interval)
    */
    @SerializedName("FileSize")
    @Expose
    private TrafficSandboxDLPFileSizeRange FileSize;

    /**
    * File format limited dimensions: format/category list after aggregation and deduplication
    */
    @SerializedName("FileType")
    @Expose
    private String [] FileType;

    /**
    * Outbound domain name detection dimension (single Value Object)
    */
    @SerializedName("URLRule")
    @Expose
    private TrafficSandboxDLPURLRuleItem URLRule;

    /**
    * Outbound content detection dimension (multi-line, name + regular)
    */
    @SerializedName("TrafficRule")
    @Expose
    private TrafficSandboxDLPTrafficRuleItem [] TrafficRule;

    /**
     * Get File name match dimension: summarized and deduplicated file name/regular list 
     * @return FileName File name match dimension: summarized and deduplicated file name/regular list
     */
    public String [] getFileName() {
        return this.FileName;
    }

    /**
     * Set File name match dimension: summarized and deduplicated file name/regular list
     * @param FileName File name match dimension: summarized and deduplicated file name/regular list
     */
    public void setFileName(String [] FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File size limit dimension (interval) 
     * @return FileSize File size limit dimension (interval)
     */
    public TrafficSandboxDLPFileSizeRange getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File size limit dimension (interval)
     * @param FileSize File size limit dimension (interval)
     */
    public void setFileSize(TrafficSandboxDLPFileSizeRange FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get File format limited dimensions: format/category list after aggregation and deduplication 
     * @return FileType File format limited dimensions: format/category list after aggregation and deduplication
     */
    public String [] getFileType() {
        return this.FileType;
    }

    /**
     * Set File format limited dimensions: format/category list after aggregation and deduplication
     * @param FileType File format limited dimensions: format/category list after aggregation and deduplication
     */
    public void setFileType(String [] FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Outbound domain name detection dimension (single Value Object) 
     * @return URLRule Outbound domain name detection dimension (single Value Object)
     */
    public TrafficSandboxDLPURLRuleItem getURLRule() {
        return this.URLRule;
    }

    /**
     * Set Outbound domain name detection dimension (single Value Object)
     * @param URLRule Outbound domain name detection dimension (single Value Object)
     */
    public void setURLRule(TrafficSandboxDLPURLRuleItem URLRule) {
        this.URLRule = URLRule;
    }

    /**
     * Get Outbound content detection dimension (multi-line, name + regular) 
     * @return TrafficRule Outbound content detection dimension (multi-line, name + regular)
     */
    public TrafficSandboxDLPTrafficRuleItem [] getTrafficRule() {
        return this.TrafficRule;
    }

    /**
     * Set Outbound content detection dimension (multi-line, name + regular)
     * @param TrafficRule Outbound content detection dimension (multi-line, name + regular)
     */
    public void setTrafficRule(TrafficSandboxDLPTrafficRuleItem [] TrafficRule) {
        this.TrafficRule = TrafficRule;
    }

    public TrafficSandboxDLPUserRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxDLPUserRuleInfo(TrafficSandboxDLPUserRuleInfo source) {
        if (source.FileName != null) {
            this.FileName = new String[source.FileName.length];
            for (int i = 0; i < source.FileName.length; i++) {
                this.FileName[i] = new String(source.FileName[i]);
            }
        }
        if (source.FileSize != null) {
            this.FileSize = new TrafficSandboxDLPFileSizeRange(source.FileSize);
        }
        if (source.FileType != null) {
            this.FileType = new String[source.FileType.length];
            for (int i = 0; i < source.FileType.length; i++) {
                this.FileType[i] = new String(source.FileType[i]);
            }
        }
        if (source.URLRule != null) {
            this.URLRule = new TrafficSandboxDLPURLRuleItem(source.URLRule);
        }
        if (source.TrafficRule != null) {
            this.TrafficRule = new TrafficSandboxDLPTrafficRuleItem[source.TrafficRule.length];
            for (int i = 0; i < source.TrafficRule.length; i++) {
                this.TrafficRule[i] = new TrafficSandboxDLPTrafficRuleItem(source.TrafficRule[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileName.", this.FileName);
        this.setParamObj(map, prefix + "FileSize.", this.FileSize);
        this.setParamArraySimple(map, prefix + "FileType.", this.FileType);
        this.setParamObj(map, prefix + "URLRule.", this.URLRule);
        this.setParamArrayObj(map, prefix + "TrafficRule.", this.TrafficRule);

    }
}

