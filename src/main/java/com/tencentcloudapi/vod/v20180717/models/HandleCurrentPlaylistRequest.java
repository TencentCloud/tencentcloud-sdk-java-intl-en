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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HandleCurrentPlaylistRequest extends AbstractModel {

    /**
    * <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id.</b>.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The unique identifier of the playlist.
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * Operation type. Valid values: <li>Insert: Insert a program into the current playlist. The inserted program remains valid in subsequent loop banner processes.</li> <li>InsertTemporary: Temporarily insert a program into the current playlist. Temporarily inserted programs are only effective during this loop banner process.</li><li>Delete: Delete a program from the playback list. Cannot delete currently playing programs.</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Playlist program ID. <li>When Operation is Insert, this field is required, indicating the program list to be inserted is located after this program.</li> <li>When Operation is InsertTemporary, this field is optional. If left blank, the program will be inserted at the latest insertion point. If this field is filled and SegmentIndex is also provided, the program will be inserted behind the fragment corresponding to SegmentIndex of the program specified by ItemId; otherwise, it will be inserted after the program.</li> <li>When Operation is Delete, this field is required, indicating the program to be deleted. Cannot delete currently playing programs.</li>
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * Segment index of the M3U8 file shard. The first shard of the M3U8 file has a SegmentIndex of 0. This parameter is valid when Operation is InsertTemporary and ItemId has a value.
    */
    @SerializedName("SegmentIndex")
    @Expose
    private Long SegmentIndex;

    /**
    * Program list. required when operation is insert, inserttemporary, delete, indicating the list of programs to be operated on. the list length can be up to a maximum of 10.
    */
    @SerializedName("RoundPlaylist")
    @Expose
    private RoundPlayListItemInfo [] RoundPlaylist;

    /**
     * Get <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id.</b>. 
     * @return SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id.</b>.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id.</b>.
     * @param SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id.</b>.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The unique identifier of the playlist. 
     * @return RoundPlayId The unique identifier of the playlist.
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set The unique identifier of the playlist.
     * @param RoundPlayId The unique identifier of the playlist.
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get Operation type. Valid values: <li>Insert: Insert a program into the current playlist. The inserted program remains valid in subsequent loop banner processes.</li> <li>InsertTemporary: Temporarily insert a program into the current playlist. Temporarily inserted programs are only effective during this loop banner process.</li><li>Delete: Delete a program from the playback list. Cannot delete currently playing programs.</li> 
     * @return Operation Operation type. Valid values: <li>Insert: Insert a program into the current playlist. The inserted program remains valid in subsequent loop banner processes.</li> <li>InsertTemporary: Temporarily insert a program into the current playlist. Temporarily inserted programs are only effective during this loop banner process.</li><li>Delete: Delete a program from the playback list. Cannot delete currently playing programs.</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation type. Valid values: <li>Insert: Insert a program into the current playlist. The inserted program remains valid in subsequent loop banner processes.</li> <li>InsertTemporary: Temporarily insert a program into the current playlist. Temporarily inserted programs are only effective during this loop banner process.</li><li>Delete: Delete a program from the playback list. Cannot delete currently playing programs.</li>
     * @param Operation Operation type. Valid values: <li>Insert: Insert a program into the current playlist. The inserted program remains valid in subsequent loop banner processes.</li> <li>InsertTemporary: Temporarily insert a program into the current playlist. Temporarily inserted programs are only effective during this loop banner process.</li><li>Delete: Delete a program from the playback list. Cannot delete currently playing programs.</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Playlist program ID. <li>When Operation is Insert, this field is required, indicating the program list to be inserted is located after this program.</li> <li>When Operation is InsertTemporary, this field is optional. If left blank, the program will be inserted at the latest insertion point. If this field is filled and SegmentIndex is also provided, the program will be inserted behind the fragment corresponding to SegmentIndex of the program specified by ItemId; otherwise, it will be inserted after the program.</li> <li>When Operation is Delete, this field is required, indicating the program to be deleted. Cannot delete currently playing programs.</li> 
     * @return ItemId Playlist program ID. <li>When Operation is Insert, this field is required, indicating the program list to be inserted is located after this program.</li> <li>When Operation is InsertTemporary, this field is optional. If left blank, the program will be inserted at the latest insertion point. If this field is filled and SegmentIndex is also provided, the program will be inserted behind the fragment corresponding to SegmentIndex of the program specified by ItemId; otherwise, it will be inserted after the program.</li> <li>When Operation is Delete, this field is required, indicating the program to be deleted. Cannot delete currently playing programs.</li>
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set Playlist program ID. <li>When Operation is Insert, this field is required, indicating the program list to be inserted is located after this program.</li> <li>When Operation is InsertTemporary, this field is optional. If left blank, the program will be inserted at the latest insertion point. If this field is filled and SegmentIndex is also provided, the program will be inserted behind the fragment corresponding to SegmentIndex of the program specified by ItemId; otherwise, it will be inserted after the program.</li> <li>When Operation is Delete, this field is required, indicating the program to be deleted. Cannot delete currently playing programs.</li>
     * @param ItemId Playlist program ID. <li>When Operation is Insert, this field is required, indicating the program list to be inserted is located after this program.</li> <li>When Operation is InsertTemporary, this field is optional. If left blank, the program will be inserted at the latest insertion point. If this field is filled and SegmentIndex is also provided, the program will be inserted behind the fragment corresponding to SegmentIndex of the program specified by ItemId; otherwise, it will be inserted after the program.</li> <li>When Operation is Delete, this field is required, indicating the program to be deleted. Cannot delete currently playing programs.</li>
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Segment index of the M3U8 file shard. The first shard of the M3U8 file has a SegmentIndex of 0. This parameter is valid when Operation is InsertTemporary and ItemId has a value. 
     * @return SegmentIndex Segment index of the M3U8 file shard. The first shard of the M3U8 file has a SegmentIndex of 0. This parameter is valid when Operation is InsertTemporary and ItemId has a value.
     */
    public Long getSegmentIndex() {
        return this.SegmentIndex;
    }

    /**
     * Set Segment index of the M3U8 file shard. The first shard of the M3U8 file has a SegmentIndex of 0. This parameter is valid when Operation is InsertTemporary and ItemId has a value.
     * @param SegmentIndex Segment index of the M3U8 file shard. The first shard of the M3U8 file has a SegmentIndex of 0. This parameter is valid when Operation is InsertTemporary and ItemId has a value.
     */
    public void setSegmentIndex(Long SegmentIndex) {
        this.SegmentIndex = SegmentIndex;
    }

    /**
     * Get Program list. required when operation is insert, inserttemporary, delete, indicating the list of programs to be operated on. the list length can be up to a maximum of 10. 
     * @return RoundPlaylist Program list. required when operation is insert, inserttemporary, delete, indicating the list of programs to be operated on. the list length can be up to a maximum of 10.
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set Program list. required when operation is insert, inserttemporary, delete, indicating the list of programs to be operated on. the list length can be up to a maximum of 10.
     * @param RoundPlaylist Program list. required when operation is insert, inserttemporary, delete, indicating the list of programs to be operated on. the list length can be up to a maximum of 10.
     */
    public void setRoundPlaylist(RoundPlayListItemInfo [] RoundPlaylist) {
        this.RoundPlaylist = RoundPlaylist;
    }

    public HandleCurrentPlaylistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HandleCurrentPlaylistRequest(HandleCurrentPlaylistRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RoundPlayId != null) {
            this.RoundPlayId = new String(source.RoundPlayId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.SegmentIndex != null) {
            this.SegmentIndex = new Long(source.SegmentIndex);
        }
        if (source.RoundPlaylist != null) {
            this.RoundPlaylist = new RoundPlayListItemInfo[source.RoundPlaylist.length];
            for (int i = 0; i < source.RoundPlaylist.length; i++) {
                this.RoundPlaylist[i] = new RoundPlayListItemInfo(source.RoundPlaylist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "RoundPlayId", this.RoundPlayId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "SegmentIndex", this.SegmentIndex);
        this.setParamArrayObj(map, prefix + "RoundPlaylist.", this.RoundPlaylist);

    }
}

