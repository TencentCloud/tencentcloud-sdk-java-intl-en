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

public class EditTagVO extends AbstractModel {

    /**
    * Transaction ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * Transaction status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranStatus")
    @Expose
    private Long TranStatus;

    /**
    * Tag information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Transaction ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranId Transaction ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set Transaction ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranId Transaction ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get Transaction status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranStatus Transaction status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTranStatus() {
        return this.TranStatus;
    }

    /**
     * Set Transaction status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranStatus Transaction status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranStatus(Long TranStatus) {
        this.TranStatus = TranStatus;
    }

    /**
     * Get Tag information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Tag information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Tag information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Tag information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public EditTagVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditTagVO(EditTagVO source) {
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.TranStatus != null) {
            this.TranStatus = new Long(source.TranStatus);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamSimple(map, prefix + "TranStatus", this.TranStatus);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

