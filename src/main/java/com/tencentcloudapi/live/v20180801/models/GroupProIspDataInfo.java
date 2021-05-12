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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupProIspDataInfo extends AbstractModel{

    /**
    * District.
    */
    @SerializedName("ProvinceName")
    @Expose
    private String ProvinceName;

    /**
    * ISP.
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

    /**
    * Detailed data at the minute level.
    */
    @SerializedName("DetailInfoList")
    @Expose
    private CdnPlayStatData [] DetailInfoList;

    /**
     * Get District. 
     * @return ProvinceName District.
     */
    public String getProvinceName() {
        return this.ProvinceName;
    }

    /**
     * Set District.
     * @param ProvinceName District.
     */
    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    /**
     * Get ISP. 
     * @return IspName ISP.
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set ISP.
     * @param IspName ISP.
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * Get Detailed data at the minute level. 
     * @return DetailInfoList Detailed data at the minute level.
     */
    public CdnPlayStatData [] getDetailInfoList() {
        return this.DetailInfoList;
    }

    /**
     * Set Detailed data at the minute level.
     * @param DetailInfoList Detailed data at the minute level.
     */
    public void setDetailInfoList(CdnPlayStatData [] DetailInfoList) {
        this.DetailInfoList = DetailInfoList;
    }

    public GroupProIspDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupProIspDataInfo(GroupProIspDataInfo source) {
        if (source.ProvinceName != null) {
            this.ProvinceName = new String(source.ProvinceName);
        }
        if (source.IspName != null) {
            this.IspName = new String(source.IspName);
        }
        if (source.DetailInfoList != null) {
            this.DetailInfoList = new CdnPlayStatData[source.DetailInfoList.length];
            for (int i = 0; i < source.DetailInfoList.length; i++) {
                this.DetailInfoList[i] = new CdnPlayStatData(source.DetailInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProvinceName", this.ProvinceName);
        this.setParamSimple(map, prefix + "IspName", this.IspName);
        this.setParamArrayObj(map, prefix + "DetailInfoList.", this.DetailInfoList);

    }
}

