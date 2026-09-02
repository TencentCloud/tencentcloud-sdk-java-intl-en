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

public class ModifySandboxAlertStatusRequest extends AbstractModel {

    /**
    * Alarm type
Enumeration values:
ACL: access control
DLP: data leakage protection
LLM_AUDIT: LLM audit
    */
    @SerializedName("AlertType")
    @Expose
    private String AlertType;

    /**
    * Asset type to which it belongs
Enumeration values:
HOST: Host
CONTAINER: Container
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * Alarm record ID list
Input parameter limits: non-empty, 1-100 in length, take effect after deduplication.
    */
    @SerializedName("IDList")
    @Expose
    private Long [] IDList;

    /**
    * Target Operation
Enumeration values:
HANDLED: processed
IGNORE: ignored
PASS: allowlisted
DELETE: Delete (cannot be undone)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Alarm type
Enumeration values:
ACL: access control
DLP: data leakage protection
LLM_AUDIT: LLM audit 
     * @return AlertType Alarm type
Enumeration values:
ACL: access control
DLP: data leakage protection
LLM_AUDIT: LLM audit
     */
    public String getAlertType() {
        return this.AlertType;
    }

    /**
     * Set Alarm type
Enumeration values:
ACL: access control
DLP: data leakage protection
LLM_AUDIT: LLM audit
     * @param AlertType Alarm type
Enumeration values:
ACL: access control
DLP: data leakage protection
LLM_AUDIT: LLM audit
     */
    public void setAlertType(String AlertType) {
        this.AlertType = AlertType;
    }

    /**
     * Get Asset type to which it belongs
Enumeration values:
HOST: Host
CONTAINER: Container 
     * @return BelongAssetType Asset type to which it belongs
Enumeration values:
HOST: Host
CONTAINER: Container
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set Asset type to which it belongs
Enumeration values:
HOST: Host
CONTAINER: Container
     * @param BelongAssetType Asset type to which it belongs
Enumeration values:
HOST: Host
CONTAINER: Container
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get Alarm record ID list
Input parameter limits: non-empty, 1-100 in length, take effect after deduplication. 
     * @return IDList Alarm record ID list
Input parameter limits: non-empty, 1-100 in length, take effect after deduplication.
     */
    public Long [] getIDList() {
        return this.IDList;
    }

    /**
     * Set Alarm record ID list
Input parameter limits: non-empty, 1-100 in length, take effect after deduplication.
     * @param IDList Alarm record ID list
Input parameter limits: non-empty, 1-100 in length, take effect after deduplication.
     */
    public void setIDList(Long [] IDList) {
        this.IDList = IDList;
    }

    /**
     * Get Target Operation
Enumeration values:
HANDLED: processed
IGNORE: ignored
PASS: allowlisted
DELETE: Delete (cannot be undone) 
     * @return Status Target Operation
Enumeration values:
HANDLED: processed
IGNORE: ignored
PASS: allowlisted
DELETE: Delete (cannot be undone)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Target Operation
Enumeration values:
HANDLED: processed
IGNORE: ignored
PASS: allowlisted
DELETE: Delete (cannot be undone)
     * @param Status Target Operation
Enumeration values:
HANDLED: processed
IGNORE: ignored
PASS: allowlisted
DELETE: Delete (cannot be undone)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifySandboxAlertStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySandboxAlertStatusRequest(ModifySandboxAlertStatusRequest source) {
        if (source.AlertType != null) {
            this.AlertType = new String(source.AlertType);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.IDList != null) {
            this.IDList = new Long[source.IDList.length];
            for (int i = 0; i < source.IDList.length; i++) {
                this.IDList[i] = new Long(source.IDList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlertType", this.AlertType);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamArraySimple(map, prefix + "IDList.", this.IDList);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

