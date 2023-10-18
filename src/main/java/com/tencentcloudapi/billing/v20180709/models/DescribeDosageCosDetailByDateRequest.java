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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDosageCosDetailByDateRequest extends AbstractModel {

    /**
    * The start date of the usage query, such as `2020-09-01`.
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * The end date of the usage query (end date must be in the same month as the start date), such as `2020-09-30`.
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * Bucket name. You can use `Get Service` to query the list of all buckets under a requester account. For details, see [GET Service (List Buckets)](https://www.tencentcloud.com/document/product/436/8291).
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
     * Get The start date of the usage query, such as `2020-09-01`. 
     * @return StartDate The start date of the usage query, such as `2020-09-01`.
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set The start date of the usage query, such as `2020-09-01`.
     * @param StartDate The start date of the usage query, such as `2020-09-01`.
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get The end date of the usage query (end date must be in the same month as the start date), such as `2020-09-30`. 
     * @return EndDate The end date of the usage query (end date must be in the same month as the start date), such as `2020-09-30`.
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set The end date of the usage query (end date must be in the same month as the start date), such as `2020-09-30`.
     * @param EndDate The end date of the usage query (end date must be in the same month as the start date), such as `2020-09-30`.
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get Bucket name. You can use `Get Service` to query the list of all buckets under a requester account. For details, see [GET Service (List Buckets)](https://www.tencentcloud.com/document/product/436/8291). 
     * @return BucketName Bucket name. You can use `Get Service` to query the list of all buckets under a requester account. For details, see [GET Service (List Buckets)](https://www.tencentcloud.com/document/product/436/8291).
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Bucket name. You can use `Get Service` to query the list of all buckets under a requester account. For details, see [GET Service (List Buckets)](https://www.tencentcloud.com/document/product/436/8291).
     * @param BucketName Bucket name. You can use `Get Service` to query the list of all buckets under a requester account. For details, see [GET Service (List Buckets)](https://www.tencentcloud.com/document/product/436/8291).
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    public DescribeDosageCosDetailByDateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDosageCosDetailByDateRequest(DescribeDosageCosDetailByDateRequest source) {
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);

    }
}

