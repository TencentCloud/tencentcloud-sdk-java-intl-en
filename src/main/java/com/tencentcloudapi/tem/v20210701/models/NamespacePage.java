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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespacePage extends AbstractModel{

    /**
    * Details of the returned records
    */
    @SerializedName("Records")
    @Expose
    private TemNamespaceInfo [] Records;

    /**
    * Total number of returned records
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Number of records per page
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Total number of pages
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
     * Get Details of the returned records 
     * @return Records Details of the returned records
     */
    public TemNamespaceInfo [] getRecords() {
        return this.Records;
    }

    /**
     * Set Details of the returned records
     * @param Records Details of the returned records
     */
    public void setRecords(TemNamespaceInfo [] Records) {
        this.Records = Records;
    }

    /**
     * Get Total number of returned records 
     * @return Total Total number of returned records
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of returned records
     * @param Total Total number of returned records
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Number of records per page 
     * @return Size Number of records per page
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Number of records per page
     * @param Size Number of records per page
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Total number of pages 
     * @return Pages Total number of pages
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set Total number of pages
     * @param Pages Total number of pages
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    public NamespacePage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespacePage(NamespacePage source) {
        if (source.Records != null) {
            this.Records = new TemNamespaceInfo[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new TemNamespaceInfo(source.Records[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Pages", this.Pages);

    }
}

