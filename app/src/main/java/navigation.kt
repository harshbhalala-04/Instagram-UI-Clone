import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.synac.instagramuipractice.ReelsView
import com.synac.instagramuipractice.Screen
import com.synac.instagramuipractice.chat_screen.ChatScreen
import com.synac.instagramuipractice.main_feed_screen.MainFeedScreen
import com.synac.instagramuipractice.profile_screen.ProfileScreen

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.MainFeedScreen.route) {
        composable(route = Screen.MainFeedScreen.route) {
            MainFeedScreen(navController = navController)
        }
        composable(route = Screen.ReelsView.route) {
            ReelsView(navController = navController)
        }
        composable(route = Screen.ProfileScreen.route) {
            ProfileScreen(navController = navController)
        }
        composable(route = Screen.ChatScreen.route) {
            ChatScreen(navController = navController)
        }
    }
}