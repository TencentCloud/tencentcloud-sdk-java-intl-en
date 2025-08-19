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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PageScreenListVO extends AbstractModel {

    /**
    * Image export type. Valid values: Base64, and URL.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PicType")
    @Expose
    private String PicType;

    /**
    * Image list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("List")
    @Expose
    private PageScreenVO [] List;

    /**
    * Async transaction ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * Transaction status.
1: processing; 2: processing successful; 3: processing failed (error content in outer Msg).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranStatus")
    @Expose
    private Long TranStatus;

    /**
     * Get Image export type. Valid values: Base64, and URL.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PicType Image export type. Valid values: Base64, and URL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPicType() {
        return this.PicType;
    }

    /**
     * Set Image export type. Valid values: Base64, and URL.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PicType Image export type. Valid values: Base64, and URL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPicType(String PicType) {
        this.PicType = PicType;
    }

    /**
     * Get Image list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return List Image list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PageScreenVO [] getList() {
        return this.List;
    }

    /**
     * Set Image list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param List Image list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setList(PageScreenVO [] List) {
        this.List = List;
    }

    /**
     * Get Async transaction ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranId Async transaction ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set Async transaction ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranId Async transaction ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get Transaction status.
1: processing; 2: processing successful; 3: processing failed (error content in outer Msg).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranStatus Transaction status.
1: processing; 2: processing successful; 3: processing failed (error content in outer Msg).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTranStatus() {
        return this.TranStatus;
    }

    /**
     * Set Transaction status.
1: processing; 2: processing successful; 3: processing failed (error content in outer Msg).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranStatus Transaction status.
1: processing; 2: processing successful; 3: processing failed (error content in outer Msg).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranStatus(Long TranStatus) {
        this.TranStatus = TranStatus;
    }

    public PageScreenListVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageScreenListVO(PageScreenListVO source) {
        if (source.PicType != null) {
            this.PicType = new String(source.PicType);
        }
        if (source.List != null) {
            this.List = new PageScreenVO[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new PageScreenVO(source.List[i]);
            }
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.TranStatus != null) {
            this.TranStatus = new Long(source.TranStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PicType", this.PicType);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamSimple(map, prefix + "TranStatus", this.TranStatus);

    }
}

