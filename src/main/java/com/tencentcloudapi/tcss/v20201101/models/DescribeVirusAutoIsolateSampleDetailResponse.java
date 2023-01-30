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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusAutoIsolateSampleDetailResponse extends AbstractModel{

    /**
    * MD5 checksum of the file
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * File size (B)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Virus name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * Risk level. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Anti-virus engine
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KillEngine")
    @Expose
    private String [] KillEngine;

    /**
    * Tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Event description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HarmDescribe")
    @Expose
    private String HarmDescribe;

    /**
    * Solution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * Reference link
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReferenceLink")
    @Expose
    private String ReferenceLink;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get MD5 checksum of the file 
     * @return MD5 MD5 checksum of the file
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set MD5 checksum of the file
     * @param MD5 MD5 checksum of the file
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get File size (B)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Size File size (B)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File size (B)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Size File size (B)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Virus name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VirusName Virus name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set Virus name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VirusName Virus name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get Risk level. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskLevel Risk level. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskLevel Risk level. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Anti-virus engine
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KillEngine Anti-virus engine
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getKillEngine() {
        return this.KillEngine;
    }

    /**
     * Set Anti-virus engine
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KillEngine Anti-virus engine
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKillEngine(String [] KillEngine) {
        this.KillEngine = KillEngine;
    }

    /**
     * Get Tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Event description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HarmDescribe Event description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set Event description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HarmDescribe Event description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHarmDescribe(String HarmDescribe) {
        this.HarmDescribe = HarmDescribe;
    }

    /**
     * Get Solution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuggestScheme Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set Solution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuggestScheme Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get Reference link
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReferenceLink Reference link
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReferenceLink() {
        return this.ReferenceLink;
    }

    /**
     * Set Reference link
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReferenceLink Reference link
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReferenceLink(String ReferenceLink) {
        this.ReferenceLink = ReferenceLink;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVirusAutoIsolateSampleDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusAutoIsolateSampleDetailResponse(DescribeVirusAutoIsolateSampleDetailResponse source) {
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.KillEngine != null) {
            this.KillEngine = new String[source.KillEngine.length];
            for (int i = 0; i < source.KillEngine.length; i++) {
                this.KillEngine[i] = new String(source.KillEngine[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.HarmDescribe != null) {
            this.HarmDescribe = new String(source.HarmDescribe);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.ReferenceLink != null) {
            this.ReferenceLink = new String(source.ReferenceLink);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArraySimple(map, prefix + "KillEngine.", this.KillEngine);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "ReferenceLink", this.ReferenceLink);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

