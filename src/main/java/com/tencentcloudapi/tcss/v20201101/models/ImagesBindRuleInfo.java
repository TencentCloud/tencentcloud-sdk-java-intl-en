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

public class ImagesBindRuleInfo extends AbstractModel{

    /**
    * Image ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Number of associated containers
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * Bound rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Image size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
     * Get Image ID 
     * @return ImageId Image ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
     * @param ImageId Image ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Number of associated containers 
     * @return ContainerCnt Number of associated containers
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set Number of associated containers
     * @param ContainerCnt Number of associated containers
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get Bound rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Bound rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Bound rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Bound rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleName Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleName Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Image size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageSize Image size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set Image size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageSize Image size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get Last scan time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanTime Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanTime Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    public ImagesBindRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImagesBindRuleInfo(ImagesBindRuleInfo source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);

    }
}

