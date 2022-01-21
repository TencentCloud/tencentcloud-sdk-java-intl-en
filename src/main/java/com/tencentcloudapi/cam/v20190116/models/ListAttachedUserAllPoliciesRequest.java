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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAttachedUserAllPoliciesRequest extends AbstractModel{

    /**
    * Target user ID.
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * The number of policies displayed on each page. Value range: 1-200.
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * Page number. Value range: 1-200.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * `0`: return policies that are directly associated and inherited from the user group; `1`: return policies that are directly associated; `2`: return policies inherited from the user group.
    */
    @SerializedName("AttachType")
    @Expose
    private Long AttachType;

    /**
    * Policy type.
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * Keyword for searching.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get Target user ID. 
     * @return TargetUin Target user ID.
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set Target user ID.
     * @param TargetUin Target user ID.
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get The number of policies displayed on each page. Value range: 1-200. 
     * @return Rp The number of policies displayed on each page. Value range: 1-200.
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set The number of policies displayed on each page. Value range: 1-200.
     * @param Rp The number of policies displayed on each page. Value range: 1-200.
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get Page number. Value range: 1-200. 
     * @return Page Page number. Value range: 1-200.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number. Value range: 1-200.
     * @param Page Page number. Value range: 1-200.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get `0`: return policies that are directly associated and inherited from the user group; `1`: return policies that are directly associated; `2`: return policies inherited from the user group. 
     * @return AttachType `0`: return policies that are directly associated and inherited from the user group; `1`: return policies that are directly associated; `2`: return policies inherited from the user group.
     */
    public Long getAttachType() {
        return this.AttachType;
    }

    /**
     * Set `0`: return policies that are directly associated and inherited from the user group; `1`: return policies that are directly associated; `2`: return policies inherited from the user group.
     * @param AttachType `0`: return policies that are directly associated and inherited from the user group; `1`: return policies that are directly associated; `2`: return policies inherited from the user group.
     */
    public void setAttachType(Long AttachType) {
        this.AttachType = AttachType;
    }

    /**
     * Get Policy type. 
     * @return StrategyType Policy type.
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set Policy type.
     * @param StrategyType Policy type.
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Keyword for searching. 
     * @return Keyword Keyword for searching.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword for searching.
     * @param Keyword Keyword for searching.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListAttachedUserAllPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAttachedUserAllPoliciesRequest(ListAttachedUserAllPoliciesRequest source) {
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.AttachType != null) {
            this.AttachType = new Long(source.AttachType);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "AttachType", this.AttachType);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

