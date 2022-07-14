@smoke
Feature: F08_WishList | user can add and remove product from his wishlist
  Scenario: user can click on wishlist button on this product "HTC One M8 Android L 5.0 Lollipop"
    When user click on wishlist button on this product HTC One M8 Android L 5.0 Lollipop
    Then success message with green color is displayed

  Scenario:user can add and remove product from his wishlist then goes to wishlist tab
    When user click on wishlist button on this product HTC One M8 Android L 5.0 Lollipop
    Then success message with green color is displayed
    And  user waits until success message becomes invisible after that he clicks on Wishlist tab
