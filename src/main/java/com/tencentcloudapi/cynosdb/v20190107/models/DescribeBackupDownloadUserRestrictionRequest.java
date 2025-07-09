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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDownloadUserRestrictionRequest extends AbstractModel {

    /**
    * Pagination size
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Specifies whether to query only user-level download limits. true - yes, false - no.
    */
    @SerializedName("OnlyUserRestriction")
    @Expose
    private Boolean OnlyUserRestriction;

    /**
     * Get Pagination size 
     * @return Limit Pagination size
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination size
     * @param Limit Pagination size
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Specifies whether to query only user-level download limits. true - yes, false - no. 
     * @return OnlyUserRestriction Specifies whether to query only user-level download limits. true - yes, false - no.
     */
    public Boolean getOnlyUserRestriction() {
        return this.OnlyUserRestriction;
    }

    /**
     * Set Specifies whether to query only user-level download limits. true - yes, false - no.
     * @param OnlyUserRestriction Specifies whether to query only user-level download limits. true - yes, false - no.
     */
    public void setOnlyUserRestriction(Boolean OnlyUserRestriction) {
        this.OnlyUserRestriction = OnlyUserRestriction;
    }

    public DescribeBackupDownloadUserRestrictionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDownloadUserRestrictionRequest(DescribeBackupDownloadUserRestrictionRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OnlyUserRestriction != null) {
            this.OnlyUserRestriction = new Boolean(source.OnlyUserRestriction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OnlyUserRestriction", this.OnlyUserRestriction);

    }
}

