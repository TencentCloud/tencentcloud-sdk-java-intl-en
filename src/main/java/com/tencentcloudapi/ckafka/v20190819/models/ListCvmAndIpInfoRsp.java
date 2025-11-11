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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCvmAndIpInfoRsp extends AbstractModel {

    /**
    * cvm and IP list.
    */
    @SerializedName("CvmList")
    @Expose
    private CvmAndIpInfo [] CvmList;

    /**
    * Specifies the instance data volume.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get cvm and IP list. 
     * @return CvmList cvm and IP list.
     */
    public CvmAndIpInfo [] getCvmList() {
        return this.CvmList;
    }

    /**
     * Set cvm and IP list.
     * @param CvmList cvm and IP list.
     */
    public void setCvmList(CvmAndIpInfo [] CvmList) {
        this.CvmList = CvmList;
    }

    /**
     * Get Specifies the instance data volume. 
     * @return TotalCount Specifies the instance data volume.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Specifies the instance data volume.
     * @param TotalCount Specifies the instance data volume.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public ListCvmAndIpInfoRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCvmAndIpInfoRsp(ListCvmAndIpInfoRsp source) {
        if (source.CvmList != null) {
            this.CvmList = new CvmAndIpInfo[source.CvmList.length];
            for (int i = 0; i < source.CvmList.length; i++) {
                this.CvmList[i] = new CvmAndIpInfo(source.CvmList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CvmList.", this.CvmList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

