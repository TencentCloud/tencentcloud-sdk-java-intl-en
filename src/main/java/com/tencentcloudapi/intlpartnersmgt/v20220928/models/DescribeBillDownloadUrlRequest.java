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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillDownloadUrlRequest extends AbstractModel {

    /**
    * Bill month in the format of "yyyy-mm"; the earliest month available for query is June, 2022. Current month's billing data may be inaccurate; please download the current month's bill after it is generated at 1:00 on the 5th of the next month.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Type of bill. Valid values: L2 or L3
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
     * Get Bill month in the format of "yyyy-mm"; the earliest month available for query is June, 2022. Current month's billing data may be inaccurate; please download the current month's bill after it is generated at 1:00 on the 5th of the next month. 
     * @return Month Bill month in the format of "yyyy-mm"; the earliest month available for query is June, 2022. Current month's billing data may be inaccurate; please download the current month's bill after it is generated at 1:00 on the 5th of the next month.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Bill month in the format of "yyyy-mm"; the earliest month available for query is June, 2022. Current month's billing data may be inaccurate; please download the current month's bill after it is generated at 1:00 on the 5th of the next month.
     * @param Month Bill month in the format of "yyyy-mm"; the earliest month available for query is June, 2022. Current month's billing data may be inaccurate; please download the current month's bill after it is generated at 1:00 on the 5th of the next month.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Type of bill. Valid values: L2 or L3 
     * @return FileType Type of bill. Valid values: L2 or L3
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Type of bill. Valid values: L2 or L3
     * @param FileType Type of bill. Valid values: L2 or L3
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    public DescribeBillDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillDownloadUrlRequest(DescribeBillDownloadUrlRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

