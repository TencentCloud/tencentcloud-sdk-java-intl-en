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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableResponse extends AbstractModel {

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeysType")
    @Expose
    private String KeysType;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Columns")
    @Expose
    private Column [] Columns;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexInfos")
    @Expose
    private IndexInfo [] IndexInfos;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partition")
    @Expose
    private Partition Partition;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Distribution")
    @Expose
    private Distribution Distribution;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeysType Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKeysType() {
        return this.KeysType;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeysType Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeysType(String KeysType) {
        this.KeysType = KeysType;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Columns Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Column [] getColumns() {
        return this.Columns;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param Columns Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColumns(Column [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IndexInfos Note: This field may return null, indicating that no valid values can be obtained.
     */
    public IndexInfo [] getIndexInfos() {
        return this.IndexInfos;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param IndexInfos Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexInfos(IndexInfo [] IndexInfos) {
        this.IndexInfos = IndexInfos;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Partition Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Partition getPartition() {
        return this.Partition;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param Partition Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartition(Partition Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Distribution Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Distribution getDistribution() {
        return this.Distribution;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param Distribution Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDistribution(Distribution Distribution) {
        this.Distribution = Distribution;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableComment Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableComment Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Properties Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param Properties Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTableResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableResponse(DescribeTableResponse source) {
        if (source.KeysType != null) {
            this.KeysType = new String(source.KeysType);
        }
        if (source.Columns != null) {
            this.Columns = new Column[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new Column(source.Columns[i]);
            }
        }
        if (source.IndexInfos != null) {
            this.IndexInfos = new IndexInfo[source.IndexInfos.length];
            for (int i = 0; i < source.IndexInfos.length; i++) {
                this.IndexInfos[i] = new IndexInfo(source.IndexInfos[i]);
            }
        }
        if (source.Partition != null) {
            this.Partition = new Partition(source.Partition);
        }
        if (source.Distribution != null) {
            this.Distribution = new Distribution(source.Distribution);
        }
        if (source.TableComment != null) {
            this.TableComment = new String(source.TableComment);
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeysType", this.KeysType);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "IndexInfos.", this.IndexInfos);
        this.setParamObj(map, prefix + "Partition.", this.Partition);
        this.setParamObj(map, prefix + "Distribution.", this.Distribution);
        this.setParamSimple(map, prefix + "TableComment", this.TableComment);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

