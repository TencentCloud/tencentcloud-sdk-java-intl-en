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

public class ClusterRiskItem extends AbstractModel{

    /**
    * Check item information
    */
    @SerializedName("CheckItem")
    @Expose
    private ClusterCheckItem CheckItem;

    /**
    * Verification information
    */
    @SerializedName("VerifyInfo")
    @Expose
    private String VerifyInfo;

    /**
    * Event description and check error message
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Number of affected clusters
    */
    @SerializedName("AffectedClusterCount")
    @Expose
    private Long AffectedClusterCount;

    /**
    * Number of affected nodes
    */
    @SerializedName("AffectedNodeCount")
    @Expose
    private Long AffectedNodeCount;

    /**
     * Get Check item information 
     * @return CheckItem Check item information
     */
    public ClusterCheckItem getCheckItem() {
        return this.CheckItem;
    }

    /**
     * Set Check item information
     * @param CheckItem Check item information
     */
    public void setCheckItem(ClusterCheckItem CheckItem) {
        this.CheckItem = CheckItem;
    }

    /**
     * Get Verification information 
     * @return VerifyInfo Verification information
     */
    public String getVerifyInfo() {
        return this.VerifyInfo;
    }

    /**
     * Set Verification information
     * @param VerifyInfo Verification information
     */
    public void setVerifyInfo(String VerifyInfo) {
        this.VerifyInfo = VerifyInfo;
    }

    /**
     * Get Event description and check error message 
     * @return ErrorMessage Event description and check error message
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Event description and check error message
     * @param ErrorMessage Event description and check error message
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Number of affected clusters 
     * @return AffectedClusterCount Number of affected clusters
     */
    public Long getAffectedClusterCount() {
        return this.AffectedClusterCount;
    }

    /**
     * Set Number of affected clusters
     * @param AffectedClusterCount Number of affected clusters
     */
    public void setAffectedClusterCount(Long AffectedClusterCount) {
        this.AffectedClusterCount = AffectedClusterCount;
    }

    /**
     * Get Number of affected nodes 
     * @return AffectedNodeCount Number of affected nodes
     */
    public Long getAffectedNodeCount() {
        return this.AffectedNodeCount;
    }

    /**
     * Set Number of affected nodes
     * @param AffectedNodeCount Number of affected nodes
     */
    public void setAffectedNodeCount(Long AffectedNodeCount) {
        this.AffectedNodeCount = AffectedNodeCount;
    }

    public ClusterRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterRiskItem(ClusterRiskItem source) {
        if (source.CheckItem != null) {
            this.CheckItem = new ClusterCheckItem(source.CheckItem);
        }
        if (source.VerifyInfo != null) {
            this.VerifyInfo = new String(source.VerifyInfo);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.AffectedClusterCount != null) {
            this.AffectedClusterCount = new Long(source.AffectedClusterCount);
        }
        if (source.AffectedNodeCount != null) {
            this.AffectedNodeCount = new Long(source.AffectedNodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CheckItem.", this.CheckItem);
        this.setParamSimple(map, prefix + "VerifyInfo", this.VerifyInfo);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "AffectedClusterCount", this.AffectedClusterCount);
        this.setParamSimple(map, prefix + "AffectedNodeCount", this.AffectedNodeCount);

    }
}

