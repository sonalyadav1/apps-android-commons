package fr.free.nrw.commons.campaigns

import fr.free.nrw.commons.MvpView
import fr.free.nrw.commons.campaigns.models.Campaign

/**
 * Interface which defines the view contracts of the campaign view
 */
interface ICampaignsView : MvpView {
    fun showCampaigns(campaign: Campaign?)
}
