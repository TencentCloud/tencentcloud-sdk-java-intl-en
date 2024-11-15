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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchInfo extends AbstractModel {

    /**
    * Enables Identifier. true means enabled.
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * CLS Logset ID

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * CLS Log Topic ID

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Current log-agent Version
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Upgradable or not

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("UpgradeAble")
    @Expose
    private Boolean UpgradeAble;

    /**
    * CLS Log Topic Region
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("TopicRegion")
    @Expose
    private String TopicRegion;

    /**
     * Get Enables Identifier. true means enabled.
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Enable Enables Identifier. true means enabled.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Enables Identifier. true means enabled.
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Enable Enables Identifier. true means enabled.
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get CLS Logset ID

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return LogsetId CLS Logset ID

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set CLS Logset ID

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param LogsetId CLS Logset ID

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get CLS Log Topic ID

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return TopicId CLS Log Topic ID

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set CLS Log Topic ID

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param TopicId CLS Log Topic ID

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Current log-agent Version
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Version Current log-agent Version
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Current log-agent Version
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Version Current log-agent Version
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Upgradable or not

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return UpgradeAble Upgradable or not

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Boolean getUpgradeAble() {
        return this.UpgradeAble;
    }

    /**
     * Set Upgradable or not

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param UpgradeAble Upgradable or not

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setUpgradeAble(Boolean UpgradeAble) {
        this.UpgradeAble = UpgradeAble;
    }

    /**
     * Get CLS Log Topic Region
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return TopicRegion CLS Log Topic Region
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getTopicRegion() {
        return this.TopicRegion;
    }

    /**
     * Set CLS Log Topic Region
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param TopicRegion CLS Log Topic Region
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setTopicRegion(String TopicRegion) {
        this.TopicRegion = TopicRegion;
    }

    public SwitchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchInfo(SwitchInfo source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.UpgradeAble != null) {
            this.UpgradeAble = new Boolean(source.UpgradeAble);
        }
        if (source.TopicRegion != null) {
            this.TopicRegion = new String(source.TopicRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "UpgradeAble", this.UpgradeAble);
        this.setParamSimple(map, prefix + "TopicRegion", this.TopicRegion);

    }
}

