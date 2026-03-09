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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DLCClusterInfo extends AbstractModel {

    /**
    * dlc resource name (the role Uin needs to be added to dlc, otherwise the resource may be unavailable).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComputeResources")
    @Expose
    private String [] ComputeResources;

    /**
    * dlc region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Specify the default database for the DLC cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultDatabase")
    @Expose
    private String DefaultDatabase;

    /**
    * Cluster configuration tag (only applicable to projects in standard mode and required in standard mode). valid values:.
-Prod (live production environment).
-Dev (development environment).
    */
    @SerializedName("StandardModeEnvTag")
    @Expose
    private String StandardModeEnvTag;

    /**
    * Access account (only applicable to projects in standard mode and required in standard mode), used for submitting dlc tasks.
Use a designated sub-account and set permissions to the corresponding database and table for the sub-account. task owner mode is prone to cause task failure after the person in charge leaves. master account mode is not easy to control permissions when permissions across multiple projects are different.

Enumeration value:.
-TASK_RUNNER (task owner).
-OWNER (master account mode).
-SUB (sub-account mode).
    */
    @SerializedName("AccessAccount")
    @Expose
    private String AccessAccount;

    /**
    * Sub-Account id (only applicable to projects in standard mode). when AccessAccount is in sub-account mode, the designated sub-account id information is required. other modes do not require specifying.
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
     * Get dlc resource name (the role Uin needs to be added to dlc, otherwise the resource may be unavailable).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComputeResources dlc resource name (the role Uin needs to be added to dlc, otherwise the resource may be unavailable).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getComputeResources() {
        return this.ComputeResources;
    }

    /**
     * Set dlc resource name (the role Uin needs to be added to dlc, otherwise the resource may be unavailable).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComputeResources dlc resource name (the role Uin needs to be added to dlc, otherwise the resource may be unavailable).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComputeResources(String [] ComputeResources) {
        this.ComputeResources = ComputeResources;
    }

    /**
     * Get dlc region.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region dlc region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set dlc region.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region dlc region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Specify the default database for the DLC cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultDatabase Specify the default database for the DLC cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefaultDatabase() {
        return this.DefaultDatabase;
    }

    /**
     * Set Specify the default database for the DLC cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultDatabase Specify the default database for the DLC cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultDatabase(String DefaultDatabase) {
        this.DefaultDatabase = DefaultDatabase;
    }

    /**
     * Get Cluster configuration tag (only applicable to projects in standard mode and required in standard mode). valid values:.
-Prod (live production environment).
-Dev (development environment). 
     * @return StandardModeEnvTag Cluster configuration tag (only applicable to projects in standard mode and required in standard mode). valid values:.
-Prod (live production environment).
-Dev (development environment).
     */
    public String getStandardModeEnvTag() {
        return this.StandardModeEnvTag;
    }

    /**
     * Set Cluster configuration tag (only applicable to projects in standard mode and required in standard mode). valid values:.
-Prod (live production environment).
-Dev (development environment).
     * @param StandardModeEnvTag Cluster configuration tag (only applicable to projects in standard mode and required in standard mode). valid values:.
-Prod (live production environment).
-Dev (development environment).
     */
    public void setStandardModeEnvTag(String StandardModeEnvTag) {
        this.StandardModeEnvTag = StandardModeEnvTag;
    }

    /**
     * Get Access account (only applicable to projects in standard mode and required in standard mode), used for submitting dlc tasks.
Use a designated sub-account and set permissions to the corresponding database and table for the sub-account. task owner mode is prone to cause task failure after the person in charge leaves. master account mode is not easy to control permissions when permissions across multiple projects are different.

Enumeration value:.
-TASK_RUNNER (task owner).
-OWNER (master account mode).
-SUB (sub-account mode). 
     * @return AccessAccount Access account (only applicable to projects in standard mode and required in standard mode), used for submitting dlc tasks.
Use a designated sub-account and set permissions to the corresponding database and table for the sub-account. task owner mode is prone to cause task failure after the person in charge leaves. master account mode is not easy to control permissions when permissions across multiple projects are different.

Enumeration value:.
-TASK_RUNNER (task owner).
-OWNER (master account mode).
-SUB (sub-account mode).
     */
    public String getAccessAccount() {
        return this.AccessAccount;
    }

    /**
     * Set Access account (only applicable to projects in standard mode and required in standard mode), used for submitting dlc tasks.
Use a designated sub-account and set permissions to the corresponding database and table for the sub-account. task owner mode is prone to cause task failure after the person in charge leaves. master account mode is not easy to control permissions when permissions across multiple projects are different.

Enumeration value:.
-TASK_RUNNER (task owner).
-OWNER (master account mode).
-SUB (sub-account mode).
     * @param AccessAccount Access account (only applicable to projects in standard mode and required in standard mode), used for submitting dlc tasks.
Use a designated sub-account and set permissions to the corresponding database and table for the sub-account. task owner mode is prone to cause task failure after the person in charge leaves. master account mode is not easy to control permissions when permissions across multiple projects are different.

Enumeration value:.
-TASK_RUNNER (task owner).
-OWNER (master account mode).
-SUB (sub-account mode).
     */
    public void setAccessAccount(String AccessAccount) {
        this.AccessAccount = AccessAccount;
    }

    /**
     * Get Sub-Account id (only applicable to projects in standard mode). when AccessAccount is in sub-account mode, the designated sub-account id information is required. other modes do not require specifying. 
     * @return SubAccountUin Sub-Account id (only applicable to projects in standard mode). when AccessAccount is in sub-account mode, the designated sub-account id information is required. other modes do not require specifying.
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set Sub-Account id (only applicable to projects in standard mode). when AccessAccount is in sub-account mode, the designated sub-account id information is required. other modes do not require specifying.
     * @param SubAccountUin Sub-Account id (only applicable to projects in standard mode). when AccessAccount is in sub-account mode, the designated sub-account id information is required. other modes do not require specifying.
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    public DLCClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DLCClusterInfo(DLCClusterInfo source) {
        if (source.ComputeResources != null) {
            this.ComputeResources = new String[source.ComputeResources.length];
            for (int i = 0; i < source.ComputeResources.length; i++) {
                this.ComputeResources[i] = new String(source.ComputeResources[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.DefaultDatabase != null) {
            this.DefaultDatabase = new String(source.DefaultDatabase);
        }
        if (source.StandardModeEnvTag != null) {
            this.StandardModeEnvTag = new String(source.StandardModeEnvTag);
        }
        if (source.AccessAccount != null) {
            this.AccessAccount = new String(source.AccessAccount);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ComputeResources.", this.ComputeResources);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DefaultDatabase", this.DefaultDatabase);
        this.setParamSimple(map, prefix + "StandardModeEnvTag", this.StandardModeEnvTag);
        this.setParamSimple(map, prefix + "AccessAccount", this.AccessAccount);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);

    }
}

